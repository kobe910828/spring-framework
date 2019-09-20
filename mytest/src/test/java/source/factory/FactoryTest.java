package source.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/14 15:37
 */
public class FactoryTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car1 = (Car) applicationContext.getBean("car1");
		System.out.println(car1);
	}

}
