package source;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import source.aware.MyApplicationAware;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/20 14:30
 */
public class TestAware {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

		MyApplicationAware applicationAware = (MyApplicationAware) factory.getBean("myAware");

		// 只调用了三个aware方法，即BeanNameAware BeanFactoryAware BeanClassLoaderAware
		applicationAware.display();


		System.out.println("----------------------------------------");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyApplicationAware myApplicationAware = (MyApplicationAware) applicationContext.getBean("myAware");
		myApplicationAware.display();
	}

}
