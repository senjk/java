/**
 * @author 程森
 *2017年8月30日上午10:58:58
 */
package ca_mysql.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ca_mysql.dao.IService;

/**
 * @author 程森
 *2017年8月30日上午10:58:58
 */
public class IServiceDaoimpls implements IService {
	 private Connection conn;
		private PreparedStatement pst;
		private ResultSet rs;
	/* (non-Javadoc)
	 * @see ca_mysql.dao.IService#login()
	 */
	@Override
	public ResultSet service() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdqn1715cs","bdqnadmin","199615");
			String sql="select * from account ;";
			 pst= conn.prepareStatement(sql);
			 rs=pst.executeQuery();
			 rs.last();
			
			 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return rs ;
	}

}
