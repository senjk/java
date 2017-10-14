/**
 * @author 程森
 *2017年8月30日上午10:36:19
 */
package ca_mysql.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ca_mysql.dao.ILoginDao;

/**
 * @author 程森
 *2017年8月30日上午10:36:19
 */
public class ILoginDaoimpls implements ILoginDao {
	 private Connection conn;
		private PreparedStatement pst;
		private ResultSet rs;
	/* (non-Javadoc)
	 * @see cs_bs.dao.ILoginDao#login(java.lang.String, java.lang.String)
	 */
	@Override
	public int login(String code, String password) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdqn1715cs","bdqnadmin","199615");
			String sql="select * from account where code= '" +code+ "' and password='"+password+"';";
			 pst= conn.prepareStatement(sql);
			 rs=pst.executeQuery();
			 rs.last();
			 i=rs.getRow();
			 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return i;
	}

}
