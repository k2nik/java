package days14;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 8. 1. - 오전 10:41:09
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Random rnd = new Random(  10000L ); // long seed -> 필드 초기화.
		
		Scanner scanner = new Scanner(System.in);

		// 현재 시스템의 날짜 + 시간 정보
		// 2023. 8. 1. 오전 10:48:15
		int year = 2023;
		int month = 10 ;
		int day = 25;
		Date d = new Date(year - 1900, month -1, day);
		System.out.println( d.toString() );
		System.out.println( d.toLocaleString() );
		
		System.out.println( d.getDay() ); // 3   수요일
		
		// 11:03 수업시작

	} // main

} // class
