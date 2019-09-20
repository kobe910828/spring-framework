package source.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/22 13:37
 */
public class BeanFactoryPostProcessor_2 implements BeanFactoryPostProcessor, Ordered {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用 BeanFactoryPostProcessor_2 ...");

		// 获取指定的 BeanDefinition
		BeanDefinition bd = beanFactory.getBeanDefinition("student");

		MutablePropertyValues pvs = bd.getPropertyValues();

		pvs.addPropertyValue("age",18);
	}

	@Override
	public int getOrder() {
		return 2;
	}
}