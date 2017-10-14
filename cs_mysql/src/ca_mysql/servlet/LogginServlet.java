package ca_mysql.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ca_mysql.dao.IService;
import ca_mysql.dao.impl.IServiceDaoimpls;
import ca_mysql.entity.Account;
import ca_mysql.service.ILoginService;
import ca_mysql.service.impl.LoginServiceimpls;

/**
 * Servlet implementation class LogginServlet
 */
@WebServlet("/LogginServlet")
public class LogginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
	//	resp.setCharacterEncoding("UTF-8");
		String codes=req.getParameter("code");
		String passwords=req.getParameter("password1");
		ILoginService iloginservice=new LoginServiceimpls();
		boolean flag=iloginservice.login(codes, passwords);
		if(flag){
			HttpSession httpsession=req.getSession();
		    httpsession.setAttribute("code1", codes);
		    httpsession.setAttribute("password1", passwords);
		    
		    List<ResultSet> listaccount=new ArrayList<ResultSet>();
//		    for(int i=0;i<3;i++){
//		    	Account account=new Account();
//		    	account.setCode("第"+i);
//		    	account.setName("李"+(i+1));
//		    	account.setSex("男");
//		    	account.setAge(i+10);
//		    	listaccount.add(account);
//		    }
		    IService is=new IServiceDaoimpls();
		    listaccount.add(is.service());
		  httpsession.setAttribute("list", listaccount);
		  //  req.setAttribute("password1", passwords);
		  //  PrintWriter pw=resp.getWriter();
	    	//pw.write("张三");
		  PrintWriter pw=resp.getWriter();
	    	 pw.write("0");
		    	
			return;
		}else{
			//resp.sendRedirect("login.jsp");
			 PrintWriter pw=resp.getWriter();
	    	 pw.write("1");
	    	 return;
		}
	}
     
}

