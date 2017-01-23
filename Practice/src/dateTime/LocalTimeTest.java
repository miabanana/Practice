package dateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println("Now : " + now);
		
		LocalTime nowPlus = now.plusHours(1).plusMinutes(30);
		System.out.println("1.5 hours later: " + nowPlus);
		
		LocalTime nowHoursMinutes = now.truncatedTo(ChronoUnit.MINUTES);
		System.out.println("Truncate the current time to minutes: " + nowHoursMinutes);
		System.out.println("Now is: " + now.toSecondOfDay() + "seconds after midnight.");
		
		LocalTime lunch = LocalTime.of(12, 5);
		System.out.println("Do I miss lunch? " +lunch.isBefore(now));
		
	}

}
