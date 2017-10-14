/**
 * @author 程森
 *2017年9月22日下午2:59:52
 */
package cs_bs.dao;

import java.util.List;

import cs_bs.entity.Account;

/**
 * @author 程森
 *2017年9月22日下午2:59:52
 */
public interface ISelectDao {
	
	public List<Account> listAccount(Account account,String id);
	public List<Account> listAccount(Account account);
}
