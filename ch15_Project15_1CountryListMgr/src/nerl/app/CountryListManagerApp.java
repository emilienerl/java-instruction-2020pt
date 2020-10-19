package nerl.app;

import java.util.ArrayList;
import nerl.business.CountriesIO;

public class CountryListManagerApp {

	public static void main(String[] args) {

		CountriesIO countriesIO = new CountriesIO();

		System.out.println("Country List Manager");
		System.out.println();

		System.out.println("COMMAND MENU");
		System.out.println("1 - List Countries");
		System.out.println("2 - Add Country");
		System.out.println("3 - Exit");

		int command = 0;
		while (command != 3) {
			command = Console.getInt("Enter menu number: ");

			System.out.println();

			if (command == 1) {
				ArrayList<String> countries = countriesIO.getCountries();
				for (String country : countries) {
					System.out.println(country);
				}

			} else if (command == 2) {
				String newCountry = Console.getString("Enter Country: ");
				ArrayList<String> countries = countriesIO.getCountries();
				countries.add(newCountry);
				if (countriesIO.saveCountries(countries)) {
					System.out.println("This country has been saved.");
				}
			}
		}

	}
}
