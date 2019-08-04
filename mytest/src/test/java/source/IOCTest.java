package source;

import org.junit.Test;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/3 20:13
 */
public class IOCTest {
	@Test
	public void test1(){
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory registry = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
		reader.loadBeanDefinitions(resource);
		System.out.println(registry.getBeanDefinitionNames().length);
		System.out.println(registry.getBeanDefinition("user"));

		//自定义bean并注册
		AbstractBeanDefinition beanDefinition = new RootBeanDefinition(Student.class);
		beanDefinition.getPropertyValues().add("name", "xxxxx");
		registry.registerBeanDefinition("student", beanDefinition);
		System.out.println(registry.getBean("student"));
	}
}
