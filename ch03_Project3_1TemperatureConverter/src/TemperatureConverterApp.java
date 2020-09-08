import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Temperature Converter");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// degrees in Fahrenheit
			System.out.print("Enter dergrees in Fahrenheit: ");
			double F = sc.nextDouble();
			// float F = sc.nextFloat();

			// Convert Fahrenheit to Celsius
			// float C = (F - 32) * 5 / 9;
			double C = (F - 32) * 5 / 9;
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			System.out.println("Degree in Celsius: " + number.format(C));
			System.out.println();

			System.out.print("Continue? y/n: ");
			choice = sc.next();
			System.out.println();
		}
	}
}