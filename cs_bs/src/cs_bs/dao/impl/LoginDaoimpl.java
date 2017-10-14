/**
 * @author 程森
 *2017年8月29日下午2:43:39
 */
package cs_bs.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import cs_bs.common.DataSources;
import cs_bs.dao.ILoginDao;
import cs_bs.entity.Account;


/**
 * 登录
 * @author 程森
 *2017年8月29日下午2:43:39
 */
public class LoginDaoimpl implements ILoginDao {
	//private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	//private static final String DB_CONNECTION = "jdbc:mysql://127.0.0.1:3306/bdqn1715cs";
	//private static final String DB_USER = "bdqnadmin";
    //private static final String DB_PASSWORD = "199615";
    private Connection conn;
	private PreparedStatement pst;
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

	@Override
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
	

}
