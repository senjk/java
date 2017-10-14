/**
 * @author 程森
 *2017年8月30日上午10:38:30
 */
package ca_mysql.service.impl;

import ca_mysql.dao.ILoginDao;
import ca_mysql.dao.impl.ILoginDaoimpls;
import ca_mysql.service.ILoginService;

/**
 * @author 程森
 *2017年8月30日上午10:38:30
 */
public class LoginServiceimpls implements ILoginService {
	 ILoginDao iLogin =new ILoginDaoimpls();
	/* (non-Javadoc)
	 * @see cs_bs.service.ILoginService#login(java.lang.String, java.lang.String)
	 */

	  boolean flag=false;
		public boolean login(String code, String password) {
		int i=	iLogin.login(code, password);
		if(i==1){
			flag=true;
		}
			return flag;
		}

	}
