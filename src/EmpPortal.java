

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EmpPortal
 */
public class EmpPortal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpPortal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userrole="";
		HttpSession s=request.getSession();
		userrole=(String)s.getAttribute("role");
				if(!userrole.equalsIgnoreCase("Employee")){
					response.sendRedirect("/SessionExample/SessionDirect");
				}
		PrintWriter out=response.getWriter();
		out.println("<table align=center cellpadding=10><tr>"
				+ "<th><a href=\"/SessionExample/SessionDirect\" style=\"text-decoration: none;\">Admin Portal</a></th>"
				+ "<th><a href=\"/SessionExample/SessionDirect\" style=\"text-decoration: none;\">Emp Portal</a></th>"
				+ "<th><a href=\"/SessionExample/SessionDirect\" style=\"text-decoration: none;\">Database Portal</a></th>"
				+ "</tr></table>");
		out.println("<h3 align=center>Hi Employee You can see only this page.</h3>Click <a href=\"/SessionExample/user.html\">here</a> to signin again.");	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
