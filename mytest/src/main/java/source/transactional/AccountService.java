package source.transactional;

import java.math.BigDecimal;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/24 17:27
 */
public interface AccountService {
	/**
	 * 转账
	 * @param sourceAccount
	 * @param targetAccount
	 * @param money
	 */
	void transfer(String sourceAccount, String targetAccount, BigDecimal money);
}
