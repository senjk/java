/**
 * @author 程森
 *2017年9月22日下午3:01:18
 */
package cs_bs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cs_bs.common.DataSources;
import cs_bs.dao.ISelectDao;
import cs_bs.entity.Account;

/**
 * @author 程森
 *2017年9月22日下午3:01:18
 */
public class SelectDaoimpl implements ISelectDao {

	/* (non-Javadoc)
	 * @see cs_bs.dao.ISelectDao#listAccount(cs_bs.entity.Account)
	 */
	private PreparedStatement pst;
	private Connection conn;
	private ResultSet rs;
	//private  Statement st=null;
	public List<Account> listAccount(Account account) {
//		st =DataSources.getst();
		String sql="select * from account;";
		conn=DataSources.getconn();
		if(null!=account.getId()){
			sql="select * from account where id="+account.getId()+";";
		}
		List<Account> listAccount =new ArrayList<Account>();
		try {
		
			//st =conn.createStatement();
			//rs=st.executeQuery(sql);
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				account=new Account();
				account.setId(rs.getString("id"));
				account.setCode(rs.getString("code"));
				account.setName(rs.getString("name"));
				account.setSex(rs.getString("sex"));
				account.setAge(rs.getString("age"));
				listAccount.add(account);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pst, conn);
		}
		return listAccount;
	}
	@Override
	public List<Account> listAccount(Account account,String id) {
		conn=DataSources.getconn();
		String sql="select * from account where id='" + id + "' ;";
		List<Account> listAccount =new ArrayList<Account>();
		try {
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			//st =conn.createStatement();
			///rs=st.executeQuery(sql);
			while(rs.next()){
				account=new Account();
				account.setId(rs.getString("id"));
				account.setCode(rs.getString("code"));
				account.setName(rs.getString("name"));
				account.setSex(rs.getString("sex"));
				account.setAge(rs.getString("age"));
				listAccount.add(account);
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pst, conn);
		}
		return listAccount;
	}
	

}
