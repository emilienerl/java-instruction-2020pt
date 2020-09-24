
public class NumberCheckerApp {

	private static void printWelcomeMessage() {
		System.out.println("Welcome to the Odd/Even Checker");
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
			Int enterNumber = MyConsole.getInt("Enter an integer: ");

			System.out.println();

			choice = Console.getString("Continue? (y/n): ");

		}

		printFarewellMessage();
	}

}
