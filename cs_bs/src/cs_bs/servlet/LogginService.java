package cs_bs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cs_bs.entity.Account;
import cs_bs.service.ILoginService;
import cs_bs.service.ISelectService;
import cs_bs.service.impl.LoginServiceImpl;
import cs_bs.service.impl.SelectServiceimpl;

/**
 * Servlet implementation class LogginService
 */
@WebServlet("/LogginService")
public class LogginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogginService() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
	//	resp.setCharacterEncoding("UTF-8");
		String codes=req.getParameter("code");
		String passwords=req.getParameter("password1");
		ILoginService iloginservice=new LoginServiceImpl();
		ISelectService iSelect=new SelectServiceimpl();
		boolean flag=iloginservice.login(codes, passwords);
		Account account=new Account();
		if(flag){
			HttpSession httpsession=req.getSession();
		    httpsession.setAttribute("code1", codes);
		    httpsession.setAttribute("password1", passwords);
		    List<Account> listaccount =iSelect.listAccount(account);
//		    List<Account> listaccount=new ArrayList<Account>();
//		 
		  httpsession.setAttribute("list", listaccount);
		
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


