package source.proxy;

import org.junit.Test;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/2 10:59
 */
public class StaticProxyTest {

	@Test
	public void test(){
		IUserDao target = new UserDao();
		UserDaoProxy proxy = new UserDaoProxy(target);
		proxy.save();
	}
}
