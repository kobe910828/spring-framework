package source.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/30 16:40
 */
public class AspectJTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("aopAspectj.xml");
		// 注：JDK动态代理时，目标类和代理类都实现了同一个接口，属于同一级，不能互相强转，只能转换成对应的实现的接口
		HorseManApi hm = (HorseManApi)context.getBean("horseman");
		hm.rush("Ghoul");
		hm.chop("Ghoul");
		SwordMan sm = (SwordMan)context.getBean("swordman");
		sm.block("Ghoul");
		sm.chop("Ghoul");
	}
}
