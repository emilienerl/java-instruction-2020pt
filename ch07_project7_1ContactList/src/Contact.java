
public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	// constructors
	public Contact() {
		this("", "", "", "");
		// this constructor takes the four strings below

//	public Contact() 
//		firstName = "";
//		lastName = "";
//		email = "";
//		phone = "";
	}

	public Contact(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	// getters and setters

	// anyone can call this since it is public
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// helper methods

	public String displayContact() {
		String retVal = "--------------------------------------------\n"
				+ "---- Current Contact -----------------------\n" + "--------------------------------------------\n"
				+ "Name:              " + this.firstName + " " + this.lastName + "\n" + "Email Address:     "
				+ this.email + "\n" + "Phone Number:      " + this.phone + "\n"
				+ "----------------------------------------------";
		return retVal;
	}
}
