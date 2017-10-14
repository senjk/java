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

import account.entity.Account;
import account.service.IAccountService;
import account.service.impl.AccountServiceimpl;



/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/AccountServlet")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
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
		IAccountService iAccountService=new AccountServiceimpl();
		
		Account account =new Account();
		account.setId(request.getParameter("id"));
		if("0".equals(flags)){
			List<Account> listAccount =iAccountService.listAccount(account);
			Account accounts=listAccount.get(0);
			session.setAttribute("account", accounts);
			PrintWriter pw=response.getWriter();
	    	 pw.write("0");
			return;
			
		}
		if("1".equals(flags)){
			account.setCode(request.getParameter("code"));
			account.setName(request.getParameter("name"));
			account.setPassword(request.getParameter("password"));
			account.setSex(request.getParameter("sex"));
			account.setAge(request.getParameter("age"));
			flag=iAccountService.insert(account);
		}
		if("2".equals(flags)){
			flag=iAccountService.delete(account);
		}
		if("3".equals(flags)){
			account.setCode(request.getParameter("code"));
			account.setName(request.getParameter("name"));
			account.setPassword(request.getParameter("password"));
			account.setSex(request.getParameter("sex"));
			account.setAge(request.getParameter("age"));
			flag=iAccountService.update(account);
		}
		if(flag){
			List<Account> listAccount =iAccountService.listAccount(new Account());
			session.setAttribute("list", listAccount);
			PrintWriter pw=response.getWriter();
	    	 pw.write("0");
			return;
		}
		PrintWriter pw=response.getWriter();
   	 pw.write("1");
		return;
	}

}
