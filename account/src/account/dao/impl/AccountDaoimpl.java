/**
 * @author 程森
 *2017年9月24日上午11:29:25
 */
package account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import account.common.DataSources;
import account.dao.IAccountDao;
import account.entity.Account;


/**
 * @author 程森
 *2017年9月24日上午11:29:25
 */
public class AccountDaoimpl implements IAccountDao {


		// TODO Auto-generated method stub
		private PreparedStatement pstmt;
		private Connection conn;
		private ResultSet rs;
		int num=0;
		//private  Statement st=null;
		@Override
		public List<Account> listAccount(Account account) {
//			st =DataSources.getst();
			String sql="select * from account;";
			conn=DataSources.getconn();
			if(null!=account.getId()){
				sql="select * from account where id="+account.getId()+";";
			}
			List<Account> listAccount =new ArrayList<Account>();
			try {
			
				//st =conn.createStatement();
				//rs=st.executeQuery(sql);
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
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
				DataSources.closeall(rs, pstmt, conn);
			}
			return listAccount;
		}

	@Override
	public int insert(Account account) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		
		String sql="insert into account(id,code,password,name,sex,age) values(?,?,?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			pstmt.setString(2, account.getCode());
			pstmt.setString(3, account.getPassword());
			pstmt.setString(4, account.getName());
			pstmt.setString(5, account.getSex());
			pstmt.setString(6, account.getAge());
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pstmt, conn);
		}
		
		return num;
	}

	@Override
	public int update(Account account) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		
		//String sql="update  account set code='" + account.getCode() + "',password='" + account.getPassword() + "'"
			//	+ ",name='" + account.getName() + "',sex='" + account.getSex() + "'where id='" + account.getId() + "'";
		String sql="update  account set code=?,password=?,name=?,sex=?,age=? where id=?;";
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getCode());
			pstmt.setString(2, account.getPassword());
			pstmt.setString(3, account.getName());
			pstmt.setString(4, account.getSex());
			pstmt.setString(5, account.getAge());
			pstmt.setString(6, account.getId());
			num=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.close(rs, pstmt, conn);
		}
		
		return num;
	}

	@Override
	public int delete(Account account) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		String sql="delete from account where id=?;";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account.getId());
			
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

}
