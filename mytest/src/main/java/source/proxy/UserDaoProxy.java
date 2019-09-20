package source.proxy;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/2 10:55
 */
public class UserDaoProxy implements IUserDao {
	private IUserDao target;

	public UserDaoProxy(IUserDao target) {
		this.target = target;
	}

	@Override
	public void save() {
		System.out.println("开启事务");
		target.save();
		System.out.println("提交事务");
	}
}
