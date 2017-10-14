/**
 * @author 程森
 *2017年8月29日下午3:07:51
 */
package cs_bs.service;

import java.util.List;

import cs_bs.entity.Account;

/**
 * 登录业务层
 * @author 程森
 *2017年8月29日下午3:07:51
 */
public interface ILoginService {
	/**
	 * 登录业务层
	 * @param code
	 * @param password
	 * @return
	 */
  public boolean login(String code,String password);
  /**
   * 查询
   * @param account
   * @return
   */
  public List<Account> listAccount(Account account);
}
