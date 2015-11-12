import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SessionDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user=request.getParameter("username");
		String role=request.getParameter("userrole");
		HttpSession s=request.getSession();
		s.setAttribute("user", user);
		s.setAttribute("role", role);
		response.sendRedirect("/SessionExample/SessionDirect");
	}

}
