/**
 * @author 程森
 *2017年9月24日上午11:28:54
 */
package account.dao;

import java.util.List;

import account.entity.Account;


/**
 * @author 程森
 *2017年9月24日上午11:28:54
 */
public interface IAccountDao {
	public List<Account> listAccount(Account account);
	/**
	 * 插入数据
	 * @param account
	 * @return
	 */
	public int insert(Account account);
	public int update(Account account);
	public int delete(Account account);
}
