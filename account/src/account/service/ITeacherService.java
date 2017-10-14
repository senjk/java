package account.service;

import java.util.List;

import account.entity.Teacher;

public interface ITeacherService {
	 public List<Teacher> listTeacher(Teacher teacher);
	 /**
		 * 增加
		 * @param account
		 * @return
		 */
		 public boolean insert(Teacher teacher);
		 /**
		  * 更改
		  * @param account
		  * @return
		  */
		 public boolean update(Teacher teacher);
		 /**
		  * 删除    account
		  * @param account
		  * @return
		  */
		 public boolean delete(Teacher teacher);
}
