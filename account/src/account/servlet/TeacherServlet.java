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

import account.entity.Teacher;
import account.service.ITeacherService;
import account.service.impl.TeacherServiceimpl;

/**
 * Servlet implementation class TeacherServlet
 */
@WebServlet("/TeacherServlet")
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
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
		ITeacherService iTeacherService=new TeacherServiceimpl();
		Teacher teacher =new Teacher();
		teacher.setId(request.getParameter("id"));
		if("0".equals(flags)){
			teacher.setName(request.getParameter("name"));
			teacher.setSchoolid(request.getParameter("schoolid"));
			teacher.setClasss(request.getParameter("classs"));
			flag=iTeacherService.update(teacher);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("1".equals(flags)){
			teacher.setId(request.getParameter("id"));
			teacher.setName(request.getParameter("name"));
			
			teacher.setSchoolid(request.getParameter("schoolid"));
			teacher.setClasss(request.getParameter("classs"));
			flag=iTeacherService.insert(teacher);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("2".equals(flags)){
			flag=iTeacherService.delete(teacher);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("3".equals(flags)){
			List<Teacher> listTeacher =iTeacherService.listTeacher(teacher);
			Teacher teachers=listTeacher.get(0);
			session.setAttribute("teacher", teachers);
			session.setAttribute("list", listTeacher);
			PrintWriter pw=response.getWriter();
	    	 pw.write("0");
			return;
			
		}
		
		PrintWriter pw=response.getWriter();
	   	 pw.write("1");
			return;
	}

}
