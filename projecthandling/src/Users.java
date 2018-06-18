public class Users
{
	private final String ID;
	private String firstName;
	private String lastName;
	private String department;
	private String designation;

	public Users(String id, String fn, String ln, String dept, String des) {
		ID = id;
		firstName = fn;
		lastName = ln;
		department = dept;
		designation = des;
	}

	public String getId() {
		return(ID);
	}

	public void setFirstName(String fn) {
		firstName = fn;
	}

	public String getFirstName() {
		return(firstName);
	}

	public void	setLastName(String ln) {
		lastName = ln;
	}

	public String getLastName() {
		return(lastName);
	}

	public void setDepartment(String dept) {
		department = dept;
	}

	public String getDepartment() {
		return(department);
	}

	public void setDesignation(String des) {
		designation = des;
	}

	public String getDesignation() {
		return(designation);
	}

	public String toString() {
		return("ID: " + ID + ", Name: " + firstName + " " + lastName + ", Department: " + department + ", Designation: " + designation);
	}
}
