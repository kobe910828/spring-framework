package source.transactional;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/24 17:16
 */
@Repository
public class AccountDaoImpl implements AccountDao {
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public Account findByName(String name) {
		List<Account> list = jdbcTemplate.query("select * from account where name = ?", new Object[]{name},
				new BeanPropertyRowMapper<>(Account.class));
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Account account) {
		jdbcTemplate.update("update account set balance = ? where id = ?", account.getBalance(), account.getId());
	}

}
