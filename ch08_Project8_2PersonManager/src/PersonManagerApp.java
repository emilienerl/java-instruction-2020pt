
public class PersonManagerApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Person Manager");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			String custOrEmp = Console.getString("Create customer or employee? (c/e) ");

			boolean isValid = false;
			if (custOrEmp.equalsIgnoreCase("C") || custOrEmp.equalsIgnoreCase("E")) {
				isValid = true;
			}
			if (!isValid) {
				System.out.println("Error! this entry is required. Try again.");
				continue;
			}

			System.out.println();
			String firstName = Console.getString("First Name: ");
			String lastName = Console.getString("Last Name: ");

			if (custOrEmp.equalsIgnoreCase("C")) {
				String custNum = Console.getString("Customer number: ");

				Customer customer = new Customer(firstName, lastName, custNum);

				System.out.println();
				System.out.println("You entered a new Customer");
				System.out.println(customer);

			} else {
				String ssn = Console.getString("SSN: ");

				Employee employee = new Employee(firstName, lastName, ssn);

				System.out.println();
				System.out.println("You entered a new Employee");
				System.out.println(employee);
			}
			System.out.println();
			choice = Console.getString("Continue? (y/n) ");
			System.out.println();
		}

	}

}
