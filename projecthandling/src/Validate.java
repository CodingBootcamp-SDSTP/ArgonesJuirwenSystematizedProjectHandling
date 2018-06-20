import java.sql.*;

public class Validate
{
	public static boolean checkUser(String username,String password) 
	{
	boolean st =false;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/usersdb?user=projaccount&password=users&serverTimezone=UTC&useSSL=false");
		PreparedStatement ps =con.prepareStatement
			("select * from register where email=? and pass=?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs =ps.executeQuery();
		st = rs.next();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		return st;
	}
}
