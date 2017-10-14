/**
 * @author 程森
 *2017年9月21日下午5:19:14
 */
package cs_bs.service;

import cs_bs.entity.Account;

/**
 * 插入业务层
 * @author 程森
 *2017年9月21日下午5:19:14
 */
public interface IInsertService {
/**
 * 
 * @param account
 * @return
 */
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
	  * 删除  id
	  * @param id
	  * @return
	  */
	 public boolean delete(String id);
	 /**
	  * 删除    account
	  * @param account
	  * @return
	  */
	 public boolean delete(Account account);
}
