/**
 * @author 程森
 *2017年10月13日下午11:18:05
 */
package account.dao;

import java.util.List;

import account.entity.School;



/**
 * @author 程森
 *2017年10月13日下午11:18:05
 */
public interface ISchoolDao {
	public List<School> listSchool(School school);
	/**
	 * 
	 * @param teacher
	 * @return
	 */
	public int insert(School school);
	public int update(School school);
	public int delete(School school);
}
