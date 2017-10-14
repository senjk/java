/**
 * @author 程森
 *2017年10月14日上午10:17:36
 */
package account.service;

import java.util.List;

import account.entity.Student;



/**
 * @author 程森
 *2017年10月14日上午10:17:36
 */
public interface IStudentService {
	public List<Student> listStudent(Student student);
	 /**
		 * 增加
		 * @param account
		 * @return
		 */
		 public boolean insert(Student student);
		 /**
		  * 更改
		  * @param account
		  * @return
		  */
		 public boolean update(Student student);
		 /**
		  * 删除    account
		  * @param account
		  * @return
		  */
		 public boolean delete(Student student);
}
