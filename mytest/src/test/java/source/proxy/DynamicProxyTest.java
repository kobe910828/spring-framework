package source.proxy;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/2 11:17
 */
public class DynamicProxyTest {
	@Test
	public void testJDK(){
		IUserDao target = new UserDao();
		System.out.println(target.getClass());  //输出目标对象信息
		IUserDao proxy = (IUserDao) new JdkProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());  //输出代理对象信息
		proxy.save();  //执行代理方法
	}

	@Test
	public void testCglib(){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserDao.class);
		enhancer.setCallback(new CglibProxyFactory());
		UserDao proxy = (UserDao) enhancer.create();
		System.out.println(proxy.getClass());
		proxy.save();
	}
}
