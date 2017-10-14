/**
 * @author 程森
 *2017年9月24日下午12:18:35
 */
package account.service.impl;

import account.dao.ILoginDao;
import account.dao.impl.LoginDaoimpl;
import account.service.ILoginService;


/**
 * @author 程森
 *2017年9月24日下午12:18:35
 */
public class LoginServiceimpl implements ILoginService {
	ILoginDao iLogin =new LoginDaoimpl();

	   boolean flag=false;
	/* (non-Javadoc)
	 * @see account.service.ILoginService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean login(String code, String password) {
		// TODO Auto-generated method stub
		int i=	iLogin.login(code, password);
		if(i==1){
			flag=true;
		}
			return flag;
	}

}
