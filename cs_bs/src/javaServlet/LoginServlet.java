package javaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cs_bs.entity.Account;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("cs").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String names=request.getParameter("code");
		String passwords=request.getParameter("password1");
		if("程森".equals(names)&&"admin".equals(passwords)){
			HttpSession httpsession=request.getSession();
		    httpsession.setAttribute("code", names);
		    httpsession.setAttribute("password1", passwords);
		    
		    List<Account> listaccount=new ArrayList<Account>();
		    for(int i=0;i<3;i++){
		    	cs_bs.entity.Account account=new Account();
		    	account.setCode("第"+i);
		    	account.setName("李"+(i+1));
		    	account.setSex("男");
		    	account.setAge(i+"10");
		    	listaccount.add(account);
		    }
		   httpsession.setAttribute("list", listaccount);
		  //  req.setAttribute("password1", passwords);
	         PrintWriter pw=response.getWriter();
	    	 pw.write("0");
		  //  req.getRequestDispatcher("success.jsp").forward(req, resp);
			//resp.sendRedirect("success.jsp");
		    	
			return;
		}else{
			 PrintWriter pw=response.getWriter();
	    	 pw.write("1");
	    	 return;
			//resp.sendRedirect("login.jsp");
			// req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}
