package source.transactional;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/9/24 17:02
 */
public class Account implements Serializable {
	/** 主键id **/
	private Integer id;

	/** 姓名 **/
	private String name;

	/** 余额 **/
	private BigDecimal balance;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
