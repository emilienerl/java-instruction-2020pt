package nerl.business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Reservation {

	// Fields

	private LocalDate arrivalDate;
	private LocalDate departureDate;
	private static final double PRICEPERNIGHT = 145.00;

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}

	// Getters and Setters are the methods. Must add values.

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public static String getPricePerNightFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String pricePerNight = currency.format(PRICEPERNIGHT);
		return pricePerNight;
	}

	public String getArrivalDateFormatted() {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		String formattedDate = dtf.format(arrivalDate);
		return formattedDate;
	}
}
