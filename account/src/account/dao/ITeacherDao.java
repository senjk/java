/**
 * @author 程森
 *2017年10月13日下午4:52:58
 */
package account.dao;

import java.util.List;

import account.entity.Teacher;



/**
 * @author 程森
 *2017年10月13日下午4:52:58
 */
public interface ITeacherDao {
	public List<Teacher> listTeacher(Teacher teacher);
	/**
	 * 
	 * @param teacher
	 * @return
	 */
	public int insert(Teacher teacher);
	public int update(Teacher teacher);
	public int delete(Teacher teacher);
}
