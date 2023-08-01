package days09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Scanner;
 

/**
 * @author kenik
 * @date 2023. 7. 25. - 오후 2:47:26
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) { 
		int year, month;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 년도 월 입력 ?");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
			printCalendar(year, month);
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		 

	} // main

	private static void printCalendar(int year, int month) {
		 
		int dayOfWeek = getDayOfWeek(year, month, 1 ); 
		int lastDay = getLastDay(year, month);
		
		 
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(60));
		String week ="일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c",week.charAt(i) ); 
		} // for
		System.out.println(); // 개행
		System.out.println("-".repeat(60)); 
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		} // for
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("\t%d",i ); 
			if( (i + dayOfWeek) % 7 == 0 ) System.out.println();
		} // for
		System.out.println(); // 개행
		System.out.println("-".repeat(60));
		
	}
	
	private static int getDayOfWeek(int year, int month, int day) {
		LocalDate d = LocalDate.of(year, month, day);
		DayOfWeek w = d.getDayOfWeek();
		int dayOfWeek = w.getValue() % 7; // 월(1) ~ 일(7)
		return dayOfWeek;
	} 
	
	// [2]
	private static int getLastDay(int year, int month) {
		LocalDate d = LocalDate.of(year, month, 1);
		// [1]
		/*
		LocalDate ld = d.withDayOfMonth(d.lengthOfMonth()); 
		int lastDay = ld.getDayOfMonth();
		*/
		// [2]
		YearMonth ym = YearMonth.from(d);
		LocalDate ld = ym.atEndOfMonth();
		int lastDay = ld.getDayOfMonth();
		return lastDay;
	}
	
	private static int getTotalDays(int year, int month, int day) {
		
		LocalDate startDate = LocalDate.parse("0001-01-01");
		LocalDate endDate = LocalDate.of(year, month, day);
		// LocalDate endDate = LocalDate.now();
		
		//System.out.println( startDate.until(endDate, ChronoUnit.YEARS) );
		//System.out.println( startDate.until(endDate, ChronoUnit.MONTHS) );
		//System.out.println( startDate.until(endDate, ChronoUnit.DAYS) + 1 );
		int totalDays = (int) (startDate.until(endDate, ChronoUnit.DAYS) + 1) ;
		
		return totalDays;
	}
 
} // class









