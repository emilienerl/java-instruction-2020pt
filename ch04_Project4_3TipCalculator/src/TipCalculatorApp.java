import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Variable declaration
		BigDecimal percent15 = new BigDecimal(".15");
		BigDecimal percent20 = new BigDecimal(".20");
		BigDecimal percent25 = new BigDecimal(".25");

		// Number Formatter
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);

		// Welcome Message
		System.out.println("Welcome to the Tip Calculator");
		System.out.println();

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get input from user
			System.out.print("Cost of Meal: ");
			BigDecimal mealCost = sc.nextBigDecimal();

			System.out.println();

			// 15% Tip
			System.out.println("15%");
			BigDecimal tipAmount15 = percent15.multiply(mealCost);
			System.out.print("Tip Amount:  " + currency.format(tipAmount15) + "\n");

			BigDecimal totalAmount15 = mealCost.add(tipAmount15);
			System.out.print("Total amount: " + currency.format(totalAmount15) + "\n");

			System.out.println();

			// 20% Tip
			System.out.println("20%");
			BigDecimal tipAmount20 = percent20.multiply(mealCost);
			System.out.print("Tip Amount:  " + currency.format(tipAmount20) + "\n");

			BigDecimal totalAmount20 = mealCost.add(tipAmount20);
			System.out.print("Total amount: " + currency.format(totalAmount20) + "\n");

			System.out.println();

			// 25% Tip
			System.out.println("25%");
			BigDecimal tipAmount25 = percent25.multiply(mealCost);
			System.out.print("Tip Amount:  " + currency.format(tipAmount25) + "\n");

			BigDecimal totalAmount25 = mealCost.add(tipAmount25);
			System.out.print("Total amount: " + currency.format(totalAmount25) + "\n");

			System.out.println();

			// prompt to continue
			System.out.print("Continue? y/n: ");
			choice = sc.next();
			System.out.println();

		} // end while loop
	} // end main()
} // end TipCalculatorApp
