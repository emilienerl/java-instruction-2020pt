import java.util.Scanner;

public class TimeCalculatorApp {

	public static void main(String[] args) {
		final int MINUTES_PER_HOUR = 60;

		System.out.println("Welcome to the Travel Time Calculator");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) { // start of while loop

			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();

			System.out.print("Enter miles per hour: ");
			double mph = sc.nextDouble();

			int hours = (int) (miles / mph);

			int minutes = (int) ((hours * MINUTES_PER_HOUR) % MINUTES_PER_HOUR);

			System.out.println();

			System.out.println("Estimated Travel Time");
			System.out.println("======================");

			System.out.println("Hours: " + hours);
			System.out.println("Minutes: " + minutes);

			System.out.println();

			System.out.print("Continue? y/n: ");
			choice = sc.next();
			System.out.println();
		}
	}
}