package nerl.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimeApp {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);

		LocalDate weddingDate = LocalDate.of(2012, Month.OCTOBER, 13);
		System.out.println(weddingDate);
		System.out.println(weddingDate.getMonthValue());
		System.out.println(weddingDate.getMonth());
		System.out.println(weddingDate.getDayOfWeek());

		LocalDate dateFromParse = LocalDate.parse("2020-01-01");
		System.out.println(dateFromParse);

		System.out.println("Is weddingDate before currentDate? " + weddingDate.isBefore(currentDate));
		System.out.println("weddingDate compareTo currentDate " + weddingDate.compareTo(currentDate));
		System.out.println("currentDate compareTo weddingDate " + currentDate.compareTo(weddingDate));

		LocalDate halloween = LocalDate.of(2020, Month.OCTOBER, 31);
		LocalDate february = halloween.withMonth(2);
		System.out.println(february);

		LocalDate nextMonth = currentDate.plus(1, ChronoUnit.MONTHS);
		System.out.println(nextMonth);
		LocalDate fourWeeks = currentDate.plus(4, ChronoUnit.WEEKS);
		System.out.println(fourWeeks + " " + fourWeeks.getDayOfWeek());

		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("No Formatter " + curDateTime);

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("Medium format " + dtf.format(currentDate));
	}
}
