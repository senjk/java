/**
 * @author 程森
 *2017年9月21日下午4:48:12
 */
package cs_bs.dao.impl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cs_bs.common.DataSources;
import cs_bs.dao.IInsertDao;
import cs_bs.entity.Account;

/**
 * @author 程森
 *2017年9月21日下午4:48:12
 */
public class InsertDaoimpl implements IInsertDao {

	/* (non-Javadoc)
	 * @see cs_bs.dao.IInsertDao#insert(cs_bs.entity.Account)
	 */
	private Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int num=0;
	@Override
	public int insert(Account account) {
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
	public int delete(String id) {
		conn=DataSources.getconn();
		String sql="delete from account where id='" + id + "'";
		try {
			pstmt=conn.prepareStatement(sql);
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
