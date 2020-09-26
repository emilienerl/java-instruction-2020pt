public class Employee implements DepartmentConstants, Displayable {
	// employee that is displayable and a product that is displayable
	// from a base class perspective employee and product are not related they just
	// implement the Displayable interface

	private int department;
	private String firstName;
	private String lastName;

	public Employee(int department, String lastName, String firstName) {
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		String dept = "unknown";
		if (department == ADMIN) {
			dept = "Administration";
		} else if (department == EDITORIAL) {
			dept = "Editorial";
		} else if (department == MARKETING) {
			dept = "Marketing";
		}
		return firstName + " " + lastName + " (" + dept + ")";
	}

}