package source.transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/24 17:35
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:transactional.xml")
//public class AccountServiceTest {
//	@Resource
//	private AccountService accountService;
//
//	@Test
//	public void test(){
//		accountService.transfer("张三", "李四", new BigDecimal("50"));
//	}
//
//}


public class AccountServiceTest {

	@Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:transactional.xml");
		AccountService accountService = applicationContext.getBean(AccountService.class);
		accountService.transfer("张三", "李四", new BigDecimal("50"));
	}

}
