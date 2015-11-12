
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDirect
 */
public class SessionDirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SessionDirect() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userrole = "";
		PrintWriter out = response.getWriter();
		HttpSession s=request.getSession();
		userrole=(String)s.getAttribute("role");
		switch (userrole.toString()) {
		case "Admin":
			request.getRequestDispatcher("/AdminPortal").forward(
					request, response);
			break;
		case "DBAdmin":
			request.getRequestDispatcher("/DBPortal").forward(
					request, response);
			break;
		case "Employee":
			request.getRequestDispatcher("/EmpPortal").forward(
					request, response);
			break;
		default:
			out.println("<table align=center cellpadding=10><tr>"
					+ "<th><a href=\"/SessionExample/SessionDirect\" style=\"text-decoration: none;\">Admin Portal</a></th>"
					+ "<th><a href=\"/SessionExample/SessionDirect\" style=\"text-decoration: none;\">Emp Portal</a></th>"
					+ "<th><a href=\"/SessionExample/SessionDirect\" style=\"text-decoration: none;\">Database Portal</a></th>"
					+ "</tr></table>");
			out.println("<h3 align=center>You have no permissions senior.</h3>Click <a href=\"/SessionExample/user.html\">here</a> to signin again.");
			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
