import java.util.ArrayList;

class UsersCollection
{
	ArrayList<User> users;

	public UserCollection() {
		users = new ArrayList<User>();
	}

	public void addUsers(User user) {
		users.add(user);
	}

	public void removeUsers(User user) {
		users.remove(user);
	}

	public ArrayList<User> getAllUsers() {
		return(users);
	}

	public User getUserByIndex(int n) {
		return(users.get(n));
	}

	public int getUserCount() {
		return(users.size());
	}

	public User getUserById(String id) {
		User user = null;
		for(int i=0; i<getUserCount(); i++) {
			if(getUserByIndex(i).getId().equalsIgnoreCase(id)) {
				user = getUserByIndex(i);
			}
		}
		return(user);
	}

	public ArrayList<User> search(String s) {
		User u = null;
		ArrayList<User> us = new ArrayList<User>();
		String str = s.toLowerCase();
		for(int i = 0; i<getUserCount(); i++) {
			u = getUserByIndex(i);
			if(matches(u, str)) {
				us.add(u);
			}
		}
		return(us);
	}

	public boolean matches(User u, String str) {
		String id = u.getId().toLowerCase();
		String firstName = u.getFirstName().toLowerCase();
		String lastName = u.getLastName().toLowerCase();
		String department = u.getDepartment().toLowerCase();
		String designation = u.getDesignation().toLowerCase();
		if(id.contains(str) || firstName.contains(str) || lastName.contains(str) || department.contains(str) || designation.contains(str)) {
			return(true);
		}
		return(false);
	}
}
