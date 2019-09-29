package source.transactional;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/24 17:05
 */
public interface AccountDao {
	/**
	 * 根据姓名查询
	 * @param name
	 * @return
	 */
	Account findByName(String name);

	/**
	 * 更新
	 * @param account
	 */
	void update(Account account);
}
