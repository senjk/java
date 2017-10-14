/**
 * @author 程森
 *2017年10月13日下午5:19:47
 */
package account.service.impl;

import java.util.List;

import account.dao.ITeacherDao;
import account.dao.impl.TeacherDaoimpl;
import account.entity.Teacher;
import account.service.ITeacherService;

/**
 * @author 程森
 *2017年10月13日下午5:19:47
 */
public class TeacherServiceimpl implements ITeacherService {
	ITeacherDao iTeacher=new TeacherDaoimpl();
	 boolean flag=false;
	/* (non-Javadoc)
	 * @see account.service.ITeacherService#listTeacher(account.entity.Teacher)
	 */
	@Override
	public List<Teacher> listTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		List<Teacher> listTeacher =iTeacher.listTeacher(teacher);
		return listTeacher;
	}

	/* (non-Javadoc)
	 * @see account.service.ITeacherService#insert(account.entity.Teacher)
	 */
	@Override
	public boolean insert(Teacher teacher) {
		// TODO Auto-generated method stub
		int i= iTeacher.insert(teacher);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.ITeacherService#update(account.entity.Teacher)
	 */
	@Override
	public boolean update(Teacher teacher) {
		// TODO Auto-generated method stub
		int i= iTeacher.update(teacher);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.ITeacherService#delete(account.entity.Teacher)
	 */
	@Override
	public boolean delete(Teacher teacher) {
		// TODO Auto-generated method stub
		int i= iTeacher.delete(teacher);
		if(1==i){
			flag=true;
		}
		return flag;
	}

}
