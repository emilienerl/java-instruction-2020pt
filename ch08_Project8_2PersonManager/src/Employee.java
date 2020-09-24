
public class Employee extends Person {

	// fields
	private String ssn;

	// constructors
	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName); // super has to come first, invoking the super
		this.ssn = ssn;
	}

	// getters and setters
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// overrides
	@Override
	public String toString() {
		String maskedSsn = "xxx-xxxx-" + ssn.substring(ssn.length() - 4);
		return super.toString() + "\nSSN: " + maskedSsn;
	}

}
