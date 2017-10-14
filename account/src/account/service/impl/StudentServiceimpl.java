/**
 * @author 程森
 *2017年10月14日上午10:19:40
 */
package account.service.impl;

import java.util.List;

import account.dao.IStudentDao;
import account.dao.impl.StudentDaoimpl;
import account.entity.Student;
import account.service.IStudentService;

/**
 * @author 程森
 *2017年10月14日上午10:19:40
 */
public class StudentServiceimpl implements IStudentService {

	/* (non-Javadoc)
	 * @see account.service.IStudentService#listStudent(account.entity.Student)
	 */
	IStudentDao iStudent=new StudentDaoimpl();
	 boolean flag=false;
	@Override
	public List<Student> listStudent(Student student) {
		// TODO Auto-generated method stub
		List<Student> listStudent =iStudent.listStudent(student);
		return listStudent;
	}

	/* (non-Javadoc)
	 * @see account.service.IStudentService#insert(account.entity.Student)
	 */
	@Override
	public boolean insert(Student student) {
		// TODO Auto-generated method stub
		int i= iStudent.insert(student);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.IStudentService#update(account.entity.Student)
	 */
	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		int i= iStudent.update(student);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.IStudentService#delete(account.entity.Student)
	 */
	@Override
	public boolean delete(Student student) {
		// TODO Auto-generated method stub
		int i= iStudent.delete(student);
		if(1==i){
			flag=true;
		}
		return flag;
	}

}
