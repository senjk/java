/**
 * @author 程森
 *2017年9月24日上午11:25:13
 */
package account.dao;

/**
 * @author 程森
 *2017年9月24日上午11:25:13
 */
public interface ILoginDao {
	/** 
	 * 登录
	 * @param code
	 * @param password
	 * @return
	 */
	
	public int login(String code,String password);
}
