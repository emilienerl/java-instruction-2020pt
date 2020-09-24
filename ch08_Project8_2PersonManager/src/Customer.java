
public class Customer extends Person {

	// fields
	private String customerNumber;

	// constructors
	public Customer(String firstName, String lastName, String customerNumber) {
		super(firstName, lastName); // super has to come first
		this.customerNumber = customerNumber;

	}

	// getters and setters
	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCustomer Number: " + customerNumber;

	}
}
