package source.proxy;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/2 10:53
 */
public class UserDao implements IUserDao {
	@Override
	public void save() {
		System.out.println("保存数据");
	}
}
