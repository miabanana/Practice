package dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("Now: " + now);
		LocalDate javaDate = LocalDate.of(1995, 5, 23);
		System.out.println("Java's birthday:" + javaDate);
		System.out.println("Is Java's bday in the past? " + javaDate.isBefore(now));
		System.out.println("Is Java's bday in the future? " + javaDate.isAfter(now));
		System.out.println("Is Java's bday in a leap year? " + javaDate.isLeapYear());
		System.out.println("Java's bday of the week: " + javaDate.getDayOfWeek());
		System.out.println("Java's bday of the month: " + javaDate.getDayOfMonth());
		System.out.println("Java's bday of the year: " + javaDate.getDayOfYear());
		
		LocalDate nowAfter1Month = now.plusMonths(1);
		System.out.println("Now after 1 month: " + nowAfter1Month);
		LocalDate nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("First Monday after now: " + nextMonday);
		LocalDate javaDate1 = LocalDate.of(1995, Month.MAY, 23);
		System.out.println("Is the same date? " + javaDate.isEqual(javaDate1));
	}

}
