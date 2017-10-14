/**
 * @author 程森
 *2017年9月24日下午12:16:18
 */
package account.service;

/**
 * @author 程森
 *2017年9月24日下午12:16:18
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
