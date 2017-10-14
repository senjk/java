/**
 * @author 程森
 *2017年9月21日下午4:43:00
 */
package cs_bs.dao;

import cs_bs.entity.Account;

/**
 * 插入数据接口
 * @author 程森
 *2017年9月21日下午4:43:00
 */
public interface IInsertDao {

	
	/**
	 * 插入数据
	 * @param account
	 * @return
	 */
	public int insert(Account account);
	public int update(Account account);
	public int delete(String id);
	public int delete(Account account);
}
