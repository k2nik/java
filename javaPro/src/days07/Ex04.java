package days07;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 21. - 오전 10:21:26
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		int user;
		String inputData;
		
		Scanner scanner = new Scanner(System.in) ;
		
		/* [1]
		do {
			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
			inputData = scanner.next();
		} while ( !( inputData.equals("1") || inputData.equals("2") || inputData.equals("3") ) ); 
		*/
		
		// [2]
		// 첫번째 선택 +  그 외 (2,3,4,5.. ) 구분
		String regex = "[1-3]";  
		boolean flag = false;
		do {
			if (flag) {
				System.out.println("> [알림] 입력잘못(1~3)!!!");
			} // if
			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
			inputData = scanner.next();
			flag = true;
		} while ( !inputData.matches(regex) );
		
		user = Integer.parseInt(inputData);
		System.out.println( user );
	 
		

		/*
		// Character
		// 한문자를 대문자로 변환하는 메서드 : toUpperCase
		System.out.println( Character.toUpperCase('y') );
		System.out.println( Character.toUpperCase('Y') );
		
		System.out.println( Character.toLowerCase('y') );
		System.out.println( Character.toLowerCase('Y') );
		
		// String.toUpperCase()
		System.out.println(  "aBc".toUpperCase() );
		System.out.println(  "aBc".toLowerCase() );
		*/
		
		

	} // main

} // class
