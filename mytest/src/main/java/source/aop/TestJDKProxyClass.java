package source.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/4 9:43
 */
public class TestJDKProxyClass {
	public static void main(String[] args) {

		//设置系统属性
		// 将生成的代理类写入本地磁盘，class文件在 \Workspaces\项目名称\com\sun\proxy 路径下
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

		HorseManApi horseMan = new HorseMan();
		HorseManApi horseManApi = (HorseManApi) Proxy.newProxyInstance(horseMan.getClass().getClassLoader(), horseMan.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("-----------------start------------------");
						method.invoke(horseMan, args);
						System.out.println("-----------------end--------------------");
						return null;
					}
				});
		horseManApi.chop("Ghoul");
		horseManApi.rush("Jay");

	}
}
