import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("un");
		String password = request.getParameter("psw");
		
		if(Validate.checkUser(un, psw))
		{
			RequestDispatcher rs = request.getRequestDispatcher("Welcome");
			rs.forward(request, response);
		}
		else
		{
		out.println("Username or Password incorrect");
		RequestDispatcher rs = request.getRequestDispatcher("Main.html");
		rs.include(request, response);
		}
	}
}
