package source;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/7/23 9:49
 */
public class TestIOC {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginService service = (LoginService)context.getBean("loginService");
		service.login("admin");
	}
}
