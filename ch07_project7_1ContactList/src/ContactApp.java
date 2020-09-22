
public class ContactApp {

	// welcome message method
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the Contact List Application");
		System.out.println();
	}

	private static void printFarewellMessage() {
		System.out.println("Have a great day!");
		System.out.println();
	}

	public static void main(String[] args) {
		printWelcomeMessage();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String firstName = Console.getString("Enter first name: ");
			String lastName = Console.getString("Enter last name:  ");
			String email = Console.getString("Enter email:   ");
			String phone = Console.getString("Enter phone:   ");

			Contact contact = new Contact(firstName, lastName, email, phone);

//			Contact contact = new Contact();
//			contact.setFirstName(firstName);
//			contact.setLastName(lastName);
//			contact.setEmail(email);
//			contact.setPhone(phone);

			System.out.println();
			System.out.println(contact.displayContact());
			System.out.println();

			choice = Console.getString("Continue? (y/n): ");

		}

		printFarewellMessage();
	}

}
