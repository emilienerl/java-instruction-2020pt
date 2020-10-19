package nerl.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CountriesIO {

	private final String countriesFilename = "countries.txt";

	public ArrayList<String> getCountries() {

		ArrayList<String> countries = new ArrayList<>();

		try (BufferedReader in = new BufferedReader(new FileReader(countriesFilename))) {

			String line = in.readLine();
			while (line != null) {
				countries.add(line);
				line = in.readLine();
			}

		} catch (IOException e) {
			System.err.println("Caught IOException in getCountries(). Msg: " + e.getMessage());
		}
		return countries;
	}

	public boolean saveCountries(List<String> countries) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFilename)))) {
			for (String country : countries) {
				out.println(country);
			}
		} catch (IOException e) {
			System.err.println("Caught IOException in . Msg: " + e.getMessage());
			return false;
		}
		return true;
	}

}
