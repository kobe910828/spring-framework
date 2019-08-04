package source.factorybean;

import org.springframework.beans.factory.FactoryBean;
/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/2 21:38
 */
public class UserFactoryBean implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		// 假设User的实例化过程比较复杂，在此处进行User的实例化
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}