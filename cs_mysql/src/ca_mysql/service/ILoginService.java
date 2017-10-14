/**
 * @author 程森
 *2017年8月29日下午3:07:51
 */
package ca_mysql.service;

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
}
