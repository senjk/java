/**
 * @author 程森
 *2017年10月13日下午11:51:19
 */
package account.service.impl;

import java.util.List;

import account.dao.ISchoolDao;
import account.dao.impl.SchoolDaoimpl;
import account.entity.School;

import account.service.ISchoolService;

/**
 * @author 程森
 *2017年10月13日下午11:51:19
 */
public class SchoolServiceimpl implements ISchoolService {
		ISchoolDao iSchool=new SchoolDaoimpl();
		 boolean flag=false;
	/* (non-Javadoc)
	 * @see account.service.ISchoolService#listTeacher(account.entity.School)
	 */
	@Override
	public List<School> listSchool(School school) {
		// TODO Auto-generated method stub
		List<School> listSchool =iSchool.listSchool(school);
		return listSchool;
	}

	/* (non-Javadoc)
	 * @see account.service.ISchoolService#insert(account.entity.School)
	 */
	@Override
	public boolean insert(School school) {
		// TODO Auto-generated method stub
		int i= iSchool.insert(school);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.ISchoolService#update(account.entity.School)
	 */
	@Override
	public boolean update(School school) {
		// TODO Auto-generated method stub
		int i= iSchool.update(school);
		if(1==i){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see account.service.ISchoolService#delete(account.entity.School)
	 */
	@Override
	public boolean delete(School school) {
		// TODO Auto-generated method stub
		int i= iSchool.delete(school);
		if(1==i){
			flag=true;
		}
		return flag;
	}

}
