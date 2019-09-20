package source.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/2 11:10
 */
public class JdkProxyFactory {
	private Object target;

	public JdkProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyInstance(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开启事务");

						// 执行目标对象的方法
						Object object = method.invoke(target, args);

						System.out.println("提交事务");
						return object;
					}
				});
	}
}
