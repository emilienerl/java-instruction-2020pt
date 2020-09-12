import java.text.NumberFormat;

public class FutureValueApp {

	public static void main(String[] args) {

		// get the currency and percent formatters

		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(1);

		// set the monthly payment to 100 and display it to the user

		int monthlyInvestment = 100;
		System.out.println("Monthly Investment: " + currency.format(monthlyInvestment) + "\n");

		// create the header row and add it to the table

		String table = "";
		String headerRow = "Year		";
		// looping through a double till your header row reaches 7
		for (double rate = 5.0; rate < 7.0; rate += 0.5) {
			headerRow += percent.format(rate / 100) + "			";
		}
		table += headerRow + "\n";

		// loop through the years
		for (int year = 1; year < 7; year++) {

			// add year to the start of the row
			String row = year + "		";

			// loop through each interest rate
			for (double rate = 5.0; rate < 7.0; rate += .5) {
				int months = year * 12;
				double monthlyInterestRate = rate / 12 / 100;

				// calculate the future value
				double futureValue = 0.0;
				for (int i = 1; i <= months; i++) {
					futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
				}

				// add the calculation to the row
				row += currency.format(futureValue) + "		";

			}
			// add the row to the table
			table += row + "\n";

		} // close loop
		System.out.println(table);

	} // close main ()

} // close FuturaValueApp class
