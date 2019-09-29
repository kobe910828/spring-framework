package source.transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/24 17:28
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Resource
	private AccountDao accountDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void transfer(String sourceAccount, String targetAccount, BigDecimal money) {
		Account source = accountDao.findByName(sourceAccount);
		Account target = accountDao.findByName(targetAccount);
		BigDecimal sourceBalance = source.getBalance().subtract(money);
		source.setBalance(sourceBalance);
		BigDecimal targetBalance = target.getBalance().add(money);
		target.setBalance(targetBalance);
		accountDao.update(source);
		accountDao.update(target);
		int i = 1/0;
	}
}
