import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Login extends HttpServlet {
	String username;
	String password;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		username = request.getParameter("username");
		password = request.getParameter("password");
		if(Validate.checkUser(username, password)) {
			RequestDispatcher rs = request.getRequestDispatcher("Welcome");
			rs.forward(request, response);
		}
		else {
		out.println("Username or Password incorrect");
		RequestDispatcher rs = request.getRequestDispatcher("fail.html");
		rs.include(request, response);
		}
	}
}
