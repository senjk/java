/**
 * @author 程森
 *2017年8月29日下午3:10:52
 */
package cs_bs.service.impl;

import java.util.List;

import cs_bs.dao.ILoginDao;
import cs_bs.dao.impl.LoginDaoimpl;
import cs_bs.entity.Account;
import cs_bs.service.ILoginService;

/**
 * @author 程森
 *2017年8月29日下午3:10:52
 */
public class LoginServiceImpl implements ILoginService {
   ILoginDao iLogin =new LoginDaoimpl();

   boolean flag=false;
	public boolean login(String code, String password) {
	int i=	iLogin.login(code, password);
	if(i==1){
		flag=true;
	}
		return flag;
	}
	@Override
	public List<Account> listAccount(Account account) {
		// TODO Auto-generated method stub
		List<Account> listAccount =iLogin.listAccount(account);
		return listAccount;
	}

}
