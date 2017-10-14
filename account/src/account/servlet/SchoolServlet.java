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

import account.entity.School;
import account.service.ISchoolService;
import account.service.impl.SchoolServiceimpl;


/**
 * Servlet implementation class SchoolServlet
 */
@WebServlet("/SchoolServlet")
public class SchoolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SchoolServlet() {
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
		ISchoolService iSchoolService=new SchoolServiceimpl();
		School school =new School();
		school.setId(request.getParameter("id"));
		if("0".equals(flags)){
			school.setName(request.getParameter("name"));
			school.setJibie(request.getParameter("jibie"));
			
			flag=iSchoolService.update(school);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("1".equals(flags)){
			school.setId(request.getParameter("id"));
			school.setName(request.getParameter("name"));
			
			school.setJibie(request.getParameter("jibie"));
			
			flag=iSchoolService.insert(school);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("2".equals(flags)){
			flag=iSchoolService.delete(school);
			if(flag){
				PrintWriter pw=response.getWriter();
		    	 pw.write("0");
				return;
			}
		}
		if("4".equals(flags)){
			List<School> listSchool =iSchoolService.listSchool(school);
			School schools=listSchool.get(0);
			session.setAttribute("school", schools);
			session.setAttribute("list", listSchool);
			PrintWriter pw=response.getWriter();
	    	 pw.write("0");
			return;
			
		}
		
		PrintWriter pw=response.getWriter();
	   	 pw.write("1");
			return;
	}

}
