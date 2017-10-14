/**
 * @author 程森
 *2017年10月13日下午11:20:17
 */
package account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import account.common.DataSources;
import account.dao.ISchoolDao;
import account.entity.School;

/**
 * @author 程森
 *2017年10月13日下午11:20:17
 */
public class SchoolDaoimpl implements ISchoolDao {

	/* (non-Javadoc)
	 * @see account.dao.ISchoolDao#listTeacher(account.entity.School)
	 */
	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet rs;
	int num=0;
	@Override
	public List<School> listSchool(School school) {
		// TODO Auto-generated method stub
		String sql="select * from school;";
		conn=DataSources.getconn();
		if(null!=school.getId()){
			sql="select * from school where schoolid="+school.getId()+";";
		}
		List<School> listSchool =new ArrayList<School>();
		try {
			
			//st =conn.createStatement();
			//rs=st.executeQuery(sql);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				school=new School();
				school.setId(rs.getString("schoolid"));
				school.setName(rs.getString("schoolname"));
				school.setJibie(rs.getString("jibie"));
				listSchool.add(school);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pstmt, conn);
		}
		return listSchool;
	}

	/* (non-Javadoc)
	 * @see account.dao.ISchoolDao#insert(account.entity.School)
	 */
	@Override
	public int insert(School school) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		
		String sql="insert into school(schoolid,schoolname,jibie) values(?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, school.getId());
			pstmt.setString(2, school.getName());
			pstmt.setString(3, school.getJibie());
	
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pstmt, conn);
		}
		
		return num;
	}

	/* (non-Javadoc)
	 * @see account.dao.ISchoolDao#update(account.entity.School)
	 */
	@Override
	public int update(School school) {
		// TODO Auto-generated method stub
			conn=DataSources.getconn();
		
		//String sql="update  account set code='" + account.getCode() + "',password='" + account.getPassword() + "'"
			//	+ ",name='" + account.getName() + "',sex='" + account.getSex() + "'where id='" + account.getId() + "'";
		String sql="update  school set schoolname=?,jibie=? where schoolid=?;";
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, school.getName());
			pstmt.setString(2, school.getJibie());
			
			pstmt.setString(3, school.getId());
			num=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.close(rs, pstmt, conn);
		}
		
		return num;
	}

	/* (non-Javadoc)
	 * @see account.dao.ISchoolDao#delete(account.entity.School)
	 */
	@Override
	public int delete(School school) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		String sql="delete from school where schoolid=?;";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, school.getId());
			
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

}
