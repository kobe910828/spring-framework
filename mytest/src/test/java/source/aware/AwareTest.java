package source.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/20 11:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AwareTest {

	@Resource
	private ApplicationContext applicationContext;

	@Test
	public void test(){

		MyApplicationAware myApplicationAware = (MyApplicationAware)applicationContext.getBean("myAware");
		myApplicationAware.display();

	}
}
