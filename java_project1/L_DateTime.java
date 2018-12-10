package java_project1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class L_DateTime {
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalDate independenceDate = LocalDate.of(1947,Month.AUGUST,15);
		System.out.println("Today's Date is: "+localDate);
		System.out.println("Date of Independence Day is: "+independenceDate);
		System.out.println("TOday is leap year? "+localDate.isLeapYear());
		System.out.println("year of independenceday is leap year? "+localDate.isLeapYear());
		LocalDate minusDate=localDate.minusDays(20);
		System.out.println("Date before 20 days is: "+minusDate);
		LocalDate plusDate = localDate.plusDays(20);
		System.out.println("Date after 20 days is: "+plusDate);
		System.out.println("with day of month is :"+localDate.withDayOfMonth(2));
		System.out.println("Length of month @ Independence Day is :"+independenceDate.lengthOfMonth());
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("India's Current Time is: "+zonedDateTime);
		ZonedDateTime zonedDateTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("India's Current Time is: "+zonedDateTimeInParis);
		DateTimeFormatter formatterFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatterMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("Formatted Full: "+localDate.format(formatterFull));
		System.out.println("Formatted Long: "+localDate.format(formatterLong));
		System.out.println("Formatted Medium: "+localDate.format(formatterMedium));
		System.out.println("Formatted Short: "+localDate.format(formatterShort));
		LocalDate dateOfBirth = LocalDate.of(1995,Month.NOVEMBER,3);
		Period period = dateOfBirth.until(localDate);
		System.out.println("your Age is :"+period.getYears()+" Years "+period.getMonths()+" Months "+period.getDays()+" Days");
		
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in dd/MM/yyyy format :");
		String input = scanner.nextLine();
		LocalDate enteredDate = LocalDate.parse(input,formatDate);
		System.out.println("Entered date is : "+enteredDate);
		scanner.close();
		
	}

}
