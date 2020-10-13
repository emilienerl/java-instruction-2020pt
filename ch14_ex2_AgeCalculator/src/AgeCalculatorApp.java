
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Age Calculator\n");

		// Get the current date
		LocalDate currentDate = LocalDate.now();

		// Get input from the the user
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your date of birth (YYYY-MM-DD): ");
		String birthDateString = sc.nextLine();
		System.out.println();

		// Get and validate user's date of birth
		LocalDate birthDate = LocalDate.parse(birthDateString);

		// If user's date of birth is valid
		if (birthDate.isBefore(currentDate)) {

			DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

			// Format and print user's date of birth
			System.out.println("Your date of birth is " + dtf.format(birthDate));

			// Format and print the current date
			System.out.println("The current date is " + dtf.format(currentDate));

			// Calculate and print the user's age

			System.out.println("Your age is " + birthDate.until(currentDate, ChronoUnit.YEARS));

			// Display day of week user was born on
			System.out.println("You were born on a " + birthDate.getDayOfWeek());

		} else {
			System.out.println("birthdate should be in the past");
		}
	}
}