package source.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/2 11:10
 */
public class CglibProxyFactory implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("开启事务");

		Object object = methodProxy.invokeSuper(o, objects);

		System.out.println("提交事务");
		return object;
	}
}
