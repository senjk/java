package account.service;

import java.util.List;

import account.entity.Account;



public interface IAccountService {
	 public List<Account> listAccount(Account account);
	 /**
		 * 增加
		 * @param account
		 * @return
		 */
		 public boolean insert(Account account);
		 /**
		  * 更改
		  * @param account
		  * @return
		  */
		 public boolean update(Account account);
		 /**
		  * 删除    account
		  * @param account
		  * @return
		  */
		 public boolean delete(Account account);
}
