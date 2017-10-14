/**
 * @author 程森
 *2017年10月14日上午9:51:20
 */
package account.dao;

import java.util.List;

import account.entity.Student;



/**
 * @author 程森
 *2017年10月14日上午9:51:20
 */
public interface IStudentDao {
	public List<Student> listStudent(Student student);
	/**
	 * 
	 * @param teacher
	 * @return
	 */
	public int insert(Student student);
	public int update(Student student);
	public int delete(Student student);
}
