import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) { // start of while loop

			// user input
			System.out.print("Enter loan amount: ");

			// calculating loan
			double loan = sc.nextDouble();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			String loanString = currency.format(loan);

			// user input
			System.out.print("Enter interest rate: ");

			// calculating interest rate
			double interestRate = sc.nextDouble();
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			String interestRateString = percent.format(interestRate);

			System.out.println();

			// calculating interest
			double interest = loan * interestRate;
			BigDecimal interestString = new BigDecimal(Double.toString(interest));
			interestString = interestString.setScale(2, RoundingMode.HALF_UP);

			// user output
			System.out.println("Loan Amount: " + currency.format(loan));

			System.out.println("Interest rate: " + percent.format(interestRate));

			System.out.println("Interest: " + currency.format(interest));

			System.out.println();

			System.out.print("Continue? y/n: ");
			choice = sc.next();
			System.out.println();

		} // ending while loop
	} // ending main()
} // end class InterestCalculatorApp