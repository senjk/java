/**
 * @author 程森
 *2017年9月24日上午11:26:30
 */
package account.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import account.common.DataSources;
import account.dao.ILoginDao;


/**
 * @author 程森
 *2017年9月24日上午11:26:30
 */
public class LoginDaoimpl implements ILoginDao {
	 private Connection conn;
		private ResultSet rs;
		private  Statement st=null;
		@Override
		public int login(String code, String password) {
			// TODO Auto-generated method stub
			
			int i=0;
			try {
				conn=DataSources.getconn();
				st =conn.createStatement();
				// Class.forName(DB_DRIVER);  //加载驱动
				// conn=DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);//建立连接
				 String sql="select * from account where code='"+code+"' and password= '"+password+"';";
				// pst= conn.prepareStatement(sql);//转化为数据对象
				 rs=st.executeQuery(sql);
				 rs.last();
				 i=rs.getRow();
				 
				
			} //catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
		//	}
			catch(SQLException e){
				e.printStackTrace();
			}finally {
				DataSources.close(rs, st, conn);
			}
			
			return i;
		}

}
