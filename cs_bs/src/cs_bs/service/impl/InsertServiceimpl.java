/**
 * @author 程森
 *2017年9月21日下午5:21:51
 */
package cs_bs.service.impl;

import cs_bs.dao.IInsertDao;
import cs_bs.dao.impl.InsertDaoimpl;
import cs_bs.entity.Account;
import cs_bs.service.IInsertService;

/**
 * @author 程森
 *2017年9月21日下午5:21:51
 */
public class InsertServiceimpl implements IInsertService {
    IInsertDao iInsert= new InsertDaoimpl();
    boolean flag=false;
    
	@Override
	public boolean insert(Account account) {
		// TODO Auto-generated method stub
		int i= iInsert.insert(account);
		if(1==i){
			flag=true;
		}
		return flag;
	}
	
	@Override
	public boolean update(Account account) {
		// TODO Auto-generated method stub
		int i= iInsert.update(account);
		if(1==i){
			flag=true;
		}
		return flag;
	}
	@Override
	public boolean delete(String id) {
		int i= iInsert.delete(id);
		if(1==i){
			flag=true;
		}
		return flag;
	}
	@Override
	public boolean delete(Account account) {
		// TODO Auto-generated method stub
		int i= iInsert.delete(account);
		if(1==i){
			flag=true;
		}
		return flag;
	}

}
