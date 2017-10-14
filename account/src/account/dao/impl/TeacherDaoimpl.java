/**
 * @author 程森
 *2017年10月13日下午4:56:33
 */
package account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import account.common.DataSources;
import account.dao.ITeacherDao;

import account.entity.Teacher;

/**
 * @author 程森
 *2017年10月13日下午4:56:33
 */
public class TeacherDaoimpl implements ITeacherDao {

	/* (non-Javadoc)
	 * @see account.dao.ITeacherDao#listAccount(account.entity.Teacher)
	 */
	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet rs;
	int num=0;
	@Override
	public List<Teacher> listTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		String sql="select * from laoshi;";
		conn=DataSources.getconn();
		if(null!=teacher.getId()){
			sql="select * from laoshi where teacherid="+teacher.getId()+";";
		}
		List<Teacher> listTeacher =new ArrayList<Teacher>();
		try {
			
			//st =conn.createStatement();
			//rs=st.executeQuery(sql);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				teacher=new Teacher();
				teacher.setId(rs.getString("teacherid"));
				teacher.setName(rs.getString("laoshiname"));
				teacher.setSchoolid(rs.getString("schoolid"));
				teacher.setClasss(rs.getString("kecheng"));
				listTeacher.add(teacher);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pstmt, conn);
		}
		return listTeacher;
	}

	/* (non-Javadoc)
	 * @see account.dao.ITeacherDao#insert(account.entity.Teacher)
	 */
	@Override
	public int insert(Teacher teacher) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		
		String sql="insert into laoshi(teacherid,laoshiname,schoolid,kecheng) values(?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getId());
			pstmt.setString(2, teacher.getName());
			pstmt.setString(3, teacher.getSchoolid());
			pstmt.setString(4, teacher.getClasss());
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
	 * @see account.dao.ITeacherDao#update(account.entity.Teacher)
	 */
	@Override
	public int delete(Teacher teacher) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		String sql="delete from laoshi where teacherid=?;";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, teacher.getId());
			
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	/* (non-Javadoc)
	 * @see account.dao.ITeacherDao#delete(account.entity.Teacher)
	 */
	@Override
	public int update(Teacher teacher) {
		// TODO Auto-generated method stub
			conn=DataSources.getconn();
		
		//String sql="update  account set code='" + account.getCode() + "',password='" + account.getPassword() + "'"
			//	+ ",name='" + account.getName() + "',sex='" + account.getSex() + "'where id='" + account.getId() + "'";
		String sql="update  laoshi set laoshiname=?,schoolid=?,kecheng=? where teacherid=?;";
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, teacher.getName());
			pstmt.setString(2, teacher.getSchoolid());
			pstmt.setString(3, teacher.getClasss());
			pstmt.setString(4, teacher.getId());
			num=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.close(rs, pstmt, conn);
		}
		
		return num;
	}

}
