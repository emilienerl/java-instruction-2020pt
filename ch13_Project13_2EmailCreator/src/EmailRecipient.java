
public class EmailRecipient {

	// Fields
	private String emailAddress;
	private String firstName;
	private String lastName;

	// Constructor
	public EmailRecipient() {
		emailAddress = "";
		firstName = "";
		lastName = "";
	}

	public EmailRecipient(String emailAddress, String firstName, String lastName) {
		super();
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

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

}
