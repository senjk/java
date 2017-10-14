/**
 * @author 程森
 *2017年10月14日上午10:06:48
 */
package account.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import account.common.DataSources;
import account.dao.IStudentDao;
import account.entity.Student;

/**
 * @author 程森
 *2017年10月14日上午10:06:48
 */
public class StudentDaoimpl implements IStudentDao {

	/* (non-Javadoc)
	 * @see account.dao.IStudentDao#listStudent(account.entity.Student)
	 */
	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet rs;
	int num=0;
	@Override
	public List<Student> listStudent(Student student) {
		// TODO Auto-generated method stub
		String sql="select * from student;";
		conn=DataSources.getconn();
		if(null!=student.getId()){
			sql="select * from student where id="+student.getId()+";";
		}
		List<Student> listStudent =new ArrayList<Student>();
		try {
			
			//st =conn.createStatement();
			//rs=st.executeQuery(sql);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				student=new Student();
				student.setId(rs.getString("id"));
				student.setName(rs.getString("name"));
				student.setTeacher(rs.getString("teacher"));
				student.setSchoolid(rs.getString("schoolid"));
				listStudent.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DataSources.closeall(rs, pstmt, conn);
		}
		return listStudent;
	}

	/* (non-Javadoc)
	 * @see account.dao.IStudentDao#insert(account.entity.Student)
	 */
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
conn=DataSources.getconn();
		
		String sql="insert into student(id,name,teacher,schoolid) values(?,?,?,?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getTeacher());
			pstmt.setString(4, student.getSchoolid());
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
	 * @see account.dao.IStudentDao#update(account.entity.Student)
	 */
	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
			conn=DataSources.getconn();
		
		//String sql="update  account set code='" + account.getCode() + "',password='" + account.getPassword() + "'"
			//	+ ",name='" + account.getName() + "',sex='" + account.getSex() + "'where id='" + account.getId() + "'";
		String sql="update  student set name=?,teacher=?,schoolid=? where id=?;";
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getTeacher());
			pstmt.setString(3, student.getSchoolid());
			
			pstmt.setString(4, student.getId());
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
	 * @see account.dao.IStudentDao#delete(account.entity.Student)
	 */
	@Override
	public int delete(Student student) {
		// TODO Auto-generated method stub
		conn=DataSources.getconn();
		String sql="delete from student where id=?;";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, student.getId());
			
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

}
