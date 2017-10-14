/**
 * @author 程森
 *2017年9月22日下午3:13:57
 */
package cs_bs.service.impl;

import java.util.List;

import cs_bs.dao.ISelectDao;
import cs_bs.dao.impl.SelectDaoimpl;
import cs_bs.entity.Account;
import cs_bs.service.ISelectService;

/**
 * @author 程森
 *2017年9月22日下午3:13:57
 */
public class SelectServiceimpl implements ISelectService {
	ISelectDao iSelect=new SelectDaoimpl();
	/* (non-Javadoc)
	 * @see cs_bs.service.ISelectService#listAccount(cs_bs.entity.Account, java.lang.String)
	 */
	@Override
	public List<Account> listAccount(Account account, String id) {
		// TODO Auto-generated method stub
		List<Account> listAccount =iSelect.listAccount(account,id);
		return listAccount;
	}
	@Override
	public List<Account> listAccount(Account account) {
		// TODO Auto-generated method stub
		List<Account> listAccount =iSelect.listAccount(account);
		return listAccount;
	}

}
