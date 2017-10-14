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
import cs_bs.service.IInsertService;
import cs_bs.service.ILoginService;
import cs_bs.service.impl.InsertServiceimpl;
import cs_bs.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id=request.getParameter("id");
		String code=request.getParameter("code");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String age=request.getParameter("age");
		Account account=new Account();
		account.setId(id);
		account.setCode(code);
		account.setPassword(password);
		account.setName(name);
		account.setSex(sex);
		account.setAge(age);
		IInsertService iInsertservice= new InsertServiceimpl();
		boolean flag=iInsertservice.insert(account);
		ILoginService iloginservice=new LoginServiceImpl();
		if(flag){
			HttpSession httpsession=request.getSession();
		    httpsession.setAttribute("code1", code);
		    httpsession.setAttribute("password1", password);
		    List<Account> listaccount =iloginservice.listAccount(account);
//		   
		  httpsession.setAttribute("list", listaccount);
		 
		  PrintWriter pw=response.getWriter();
	    	 pw.write("0");
		    	
			return;
		}else{
			//resp.sendRedirect("login.jsp");
			 PrintWriter pw=response.getWriter();
	    	 pw.write("1");
	    	 return;
		}
	}
     
}