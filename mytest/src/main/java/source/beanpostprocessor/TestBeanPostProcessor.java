package source.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/20 15:53
 */
public class TestBeanPostProcessor {

	public static void main(String[] args) {
//		ClassPathResource resource = new ClassPathResource("applicationContext.xml");
//		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//
//		// 添加自定义BeanPostProcessor
//		factory.addBeanPostProcessor(new MyBeanPostProcessor());
//
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//		reader.loadBeanDefinitions(resource);
//
//		MyBeanPostProcessor beanPostProcessorTest = (MyBeanPostProcessor) factory.getBean("myBeanPostProcessor");
//		beanPostProcessorTest.display();


		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBeanPostProcessor myBeanPostProcessor = (MyBeanPostProcessor) applicationContext.getBean("myBeanPostProcessor");
		myBeanPostProcessor.display();
	}
}
