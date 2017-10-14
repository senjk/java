/**
 * @author 程森
 *2017年8月22日下午1:52:53
 */
package index.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author 程森
 *2017年8月22日下午1:52:53
 */
public class indexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	
		String names=req.getParameter("name");
		String passwords=req.getParameter("password");
		
		if("admin".equals(names)&&"admin".equals(passwords)){
			resp.sendRedirect("success.jsp");
			return;
		}else{
			resp.sendRedirect("redf.jsp");
		}
	}
     
}
