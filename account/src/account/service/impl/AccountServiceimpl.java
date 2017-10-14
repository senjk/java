/**
 * @author 程森
 *2017年9月24日下午12:31:06
 */
package account.service.impl;

import java.util.List;

import account.dao.IAccountDao;
import account.dao.impl.AccountDaoimpl;
import account.entity.Account;
import account.service.IAccountService;

/**
 * @author 程森
 *2017年9月24日下午12:31:06
 */
public class AccountServiceimpl implements IAccountService {
    IAccountDao iAccount= new AccountDaoimpl();
    boolean flag=false;
	/* (non-Javadoc)
	 * @see account.service.IAccountService#listAccount(account.entity.Account)
	 */
	@Override
	public List<Account> listAccount(Account account) {
		List<Account> listAccount =iAccount.listAccount(account);
		return listAccount;
	}

	/* (non-Javadoc)
	 * @see account.service.IAccountService#insert(account.entity.Account)
	 */
	@Override
	public boolean insert(Account account) {
		// TODO Auto-generated method stub
		int i= iAccount.insert(account);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.IAccountService#update(account.entity.Account)
	 */
	@Override
	public boolean update(Account account) {
		// TODO Auto-generated method stub
		int i= iAccount.update(account);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.IAccountService#delete(account.entity.Account)
	 */
	@Override
	public boolean delete(Account account) {
		// TODO Auto-generated method stub
		int i= iAccount.delete(account);
		if(1==i){
			flag=true;
		}
		return flag;
	}

}
