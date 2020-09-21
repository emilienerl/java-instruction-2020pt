import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Tip Calculator");
		System.out.println();

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		String choice;

		do {
			System.out.print("Cost of meal: ");
			BigDecimal mealCost = sc.nextBigDecimal();

			BigDecimal tipPercent = new BigDecimal("0.15");
			BigDecimal tipIncrement = new BigDecimal("0.05");

			for (int i = 0; i < 3; ++i) {
				// Calculate tip and total
				BigDecimal tipAmount = mealCost.multiply(tipPercent);
				BigDecimal totalCost = mealCost.add(tipAmount);

				System.out.println(percent.format(tipPercent));
				System.out.println("Tip Amount: " + currency.format(tipAmount));
				System.out.println("Total Amount: " + currency.format(totalCost));
				System.out.println();

				// increment to next tip amount
				tipPercent = tipPercent.add(tipIncrement);

			}
			System.out.println("Continue (y/n)");
			choice = sc.next();

		} while (choice.equalsIgnoreCase("y"));

	} // closes main ()

} // end TipCalculatorApp
