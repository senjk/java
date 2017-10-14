/**
 * @author 程森
 *2017年9月22日下午3:12:47
 */
package cs_bs.service;

import java.util.List;

import cs_bs.entity.Account;

/**
 * @author 程森
 *2017年9月22日下午3:12:47
 */
public interface ISelectService {
	 public List<Account> listAccount(Account account,String id);
	 public List<Account> listAccount(Account account);
}
