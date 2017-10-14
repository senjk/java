/**
 * @author 程森
 *2017年8月29日下午2:38:47
 */
package cs_bs.dao;

import java.util.List;

import cs_bs.entity.Account;

/**
 * 登录持久化接口
 * @author 程森
 *2017年8月29日下午2:38:47 创建
 */
public interface ILoginDao {
	/** 
	 * 登录
	 * @param code
	 * @param password
	 * @return
	 */
	
	public int login(String code,String password);
	
	/**
	 * 账户查询
	 * @param account
	 * @return
	 */
	public List<Account> listAccount(Account account);

}
