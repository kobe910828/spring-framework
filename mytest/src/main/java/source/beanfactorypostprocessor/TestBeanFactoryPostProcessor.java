package source.beanfactorypostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import source.Student;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/22 13:39
 */
public class TestBeanFactoryPostProcessor {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println("student name:" + student.getName() + "-- age:" + student.getAge());
	}

}
