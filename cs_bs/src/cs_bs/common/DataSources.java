/**
 * @author 程森
 *2017年8月30日上午11:12:20
 */
package cs_bs.common;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

import java.util.Properties;



/**
 * @author 程森
 *2017年8月30日上午11:12:20
 */
public class DataSources {
      private static Connection conn=null;
     private static Statement st=null;
      /**
       * 获取Connection对象
       * @return
       */
    
       
      
      public static Connection getconn(){
    	  Properties properties=new Properties();
    	  String jdbc="jdbc.properties";
    	  InputStream is=DataSources.class.getClassLoader().getResourceAsStream(jdbc);
		  try {
			properties.load(is);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	  
		  String driver=properties.getProperty("driver");
		  String url=properties.getProperty("url");
		  String username=properties.getProperty("username");
		  String password=properties.getProperty("password");
		  
		  
		  	try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, username, password);
//				st=conn.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  	return conn;
      }
      

      /**
       * 获取Statement对象
       * @return
       */
      public static Statement getst(){
    	  Properties properties=new Properties();
    	  String jdbc="jdbc.properties";
    	  InputStream is=DataSources.class.getClassLoader().getResourceAsStream(jdbc);
		  try {
			properties.load(is);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	  
		  String driver=properties.getProperty("driver");
		  String url=properties.getProperty("url");
		  String username=properties.getProperty("username");
		  String password=properties.getProperty("password");
		  
		  
		  	try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, username, password);
			st=conn.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  	return st;
      }
      /**
       * close
       * @param rs
       * @param st
       * @param conn
       */
      public static void close(ResultSet rs,Statement st,Connection conn){
    	  if(null!=rs){
    		  try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    	  if(null!=st){
    		  try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    	  if(null!=conn){
    		  try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
      }
      
      /**
       * closeall
       * @param rs
       * @param pst
       * @param conn
       */
      public static void closeall(ResultSet rs,PreparedStatement pst,Connection conn){
    	  if(null!=rs){
    		  try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    	  if(null!=pst){
    		  try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
    	  if(null!=conn){
    		  try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
      }
      
}
