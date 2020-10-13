package nerl.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class BootCampTimeLeftApp {

	public static void main(String[] args) {

		LocalDate bootCampStart = LocalDate.of(2020, Month.AUGUST, 10);
		LocalDate bootCampGraduation = LocalDate.of(2021, Month.FEBRUARY, 24);
		LocalDate currentDate = LocalDate.now();

		long bootCampStartDaysAgo = bootCampStart.until(currentDate, ChronoUnit.DAYS);
		long bootCampDaysRemaining = currentDate.until(bootCampGraduation, ChronoUnit.DAYS);

		System.out.println("Bootcamp started ");

	}

}
