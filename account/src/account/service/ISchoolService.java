/**
 * @author 程森
 *2017年10月13日下午11:49:32
 */
package account.service;

import java.util.List;

import account.entity.School;


/**
 * @author 程森
 *2017年10月13日下午11:49:32
 */
public interface ISchoolService {
	public List<School> listSchool(School school);
	 /**
		 * 增加
		 * @param account
		 * @return
		 */
		 public boolean insert(School school);
		 /**
		  * 更改
		  * @param account
		  * @return
		  */
		 public boolean update(School school);
		 /**
		  * 删除    account
		  * @param account
		  * @return
		  */
		 public boolean delete(School school);
}
