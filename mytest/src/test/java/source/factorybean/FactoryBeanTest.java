package source.factorybean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/2 21:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class FactoryBeanTest {

	@Resource
	private ApplicationContext applicationContext;

	@Test
	public void test() {
		Object user = applicationContext.getBean("user");
		System.out.println(user.getClass().getName());

		Object user1 = applicationContext.getBean("&user");
		System.out.println(user1.getClass().getName());
	}

}