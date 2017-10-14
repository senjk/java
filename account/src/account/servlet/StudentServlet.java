package account.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import account.entity.Student;
import account.service.IStudentService;
import account.service.impl.StudentServiceimpl;




/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String flags=request.getParameter("flag");
		boolean flag=false;
		HttpSession session =request.getSession();
		IStudentService iStudentService=new StudentServiceimpl();
		Student student =new Student();
		student.setId(request.getParameter("id"));
		if("3".equals(flags)){
			student.setName(request.getParameter("name"));
			student.setTeacher(request.getParameter("teacher"));
			student.setSchoolid(request.getParameter("schoolid"));
			flag=iStudentService.update(student);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("1".equals(flags)){
			student.setId(request.getParameter("id"));
			student.setName(request.getParameter("name"));
			
			student.setTeacher(request.getParameter("teacher"));
			student.setSchoolid(request.getParameter("schoolid"));
			
			flag=iStudentService.insert(student);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("2".equals(flags)){
			flag=iStudentService.delete(student);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("0".equals(flags)){
			List<Student> listStudent =iStudentService.listStudent(student);
			Student students=listStudent.get(0);
			session.setAttribute("student", students);
			session.setAttribute("list", listStudent);
			PrintWriter pw=response.getWriter();
	    	 pw.write("0");
			return;
			
		}
		
		PrintWriter pw=response.getWriter();
	   	 pw.write("1");
			return;
	}

}
