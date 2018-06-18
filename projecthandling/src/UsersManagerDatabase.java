import java.sql.*;
import java.util.ArrayList;

public class UsersManagerDatabase
{
	private UserCollection users;

	public UsersManagerDatabase() {
		users = new UserCollection();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/usersdb?user=projaccount&password=users&serverTimezone=UTC&useSSL=false");
			readFromSQL(conn);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public UserCollection getUserCollection() {
		return(users);
	}

	public User getUserById(String id) {
		return(users.getUserById(id));
	}

	public ArrayList<Object> search(String s) {
		ArrayList<Object> ao = new ArrayList<Object>();
		ArrayList<User> us = new ArrayList<User>();
		ao.addAll(us);
		return(ao);
	}

	public boolean readFromSQL(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		boolean v = false;
		// try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM users;");
			while(rs.next()) {
				String [] str = {
					rs.getString("id"),
					rs.getString("firstname"),
					rs.getString("lastname"),
					rs.getString("department"),
					rs.getString("designation");
				};
				createObject(str);
			}
			// rs = stmt.executeQuery("SELECT * FROM locations;");
			// while(rs.next()) {
			// 	String [] str = {
			// 		rs.getString("id"),
			// 		rs.getString("name"),
			// 		rs.getString("city"),
			// 		rs.getString("country"),
			// 		rs.getString("address"),
			// 		"location"
			// 	};
			// 	createObject(str);
			// }
			// rs = stmt.executeQuery("SELECT * FROM assets");
			// while(rs.next()) {
			// 	String [] str = {
			// 		rs.getString("name"),
			// 		rs.getString("price"),
			// 		rs.getString("location"),
			// 		rs.getString("assignedto"),
			// 		rs.getString("type")
			// 	};
			// 	createObject(str);
			// }
			v = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try { if (rs != null) rs.close(); } catch (Exception e) {};
			try { if (stmt != null) stmt.close(); } catch (Exception e) {};
		}
		return(v);
	}

	public void createObject(String... details) {
		int len = details.length - 1;
		String d = details[len];
		if("users".equals(d)) {
			User u = new User(details[0], details[1], details[2], details[4], details[5]);
			users.addUser(u); 
		}
		// else if("admin".equals(d)) {
		// 	User u = new Location(details[0], details[1], details[2], details[3], details[4]);
		// 	locations.addLocation(l);
		// }
		// else if("Building".equals(d)) {
		// 	Building b = new Building(details[0], Integer.parseInt(details[1]), details[2]);
		// 	assets.addAsset(b);
		// }
		// else if("Software License".equals(d)) {
		// 	SoftwareLicense s = new SoftwareLicense(details[0], Integer.parseInt(details[1]), details[3]);
		// 	assets.addAsset(s);
		// }
		// else if("Table".equals(d)) {
		// 	Table t = new Table(details[0], Integer.parseInt(details[1]), details[2], details[3]);
		// 	assets.addAsset(t);
		// }
	}

	public String getCollectionContent() {
		ArrayList<User> u = users.getAllUsers();
		StringBuffer sb = new StringBuffer("");
		for(int i =0; i<u.size(); i++) {
			User user = u.get(i);
			sb.append(user.toString() + "\n");
		}
		return(sb.toString());
	}
}
