/**
 * @author 程森
 *2017年8月28日上午10:11:12
 */
package mysqls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;


/**
 * @author 程森
 *2017年8月28日上午10:11:12
 */
public class Test1 {
   private static Logger logger=Logger.getLogger(Test1.class.getName());
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  
		// TODO Auto-generated method stub
		Connection conn=null;
      ///1.加载驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			logger.error(e);
		}
		//2.建立连接
		try {
			
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bdqn1715cs","bdqnadmin","199615");
		System.out.println("连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logger.error(e);
		}
		//3.关闭
		try {
			if(conn!=null){
			conn.close();
			System.out.println("关闭连接成功");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logger.error(e);
		}
	}

}
