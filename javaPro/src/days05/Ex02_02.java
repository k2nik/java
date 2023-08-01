package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오전 10:30:24
 * @subject  [복습6번 풀이]
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		// "a"->'a'   "a".charAt(0)
		 
		// char -> String 변환
		// 1) 'a' + ""
		// 2) String.valueOf('a');
		// 3) Character.toString('a');
		
		// String -> char 변환 X
		String name = "kenik";
		// 원하는 위치의 한 문자를 얻어오고 싶다.
		// char 문자열.charAt(index)
		/*
		System.out.println( name.charAt(0)   );
		System.out.println( name.charAt(1)   );
		System.out.println( name.charAt(2)   );
		System.out.println( name.charAt(3)   );
		System.out.println( name.charAt(4)   );
		*/
		// 11:02 수업시작~
		System.out.println( name.length() );
		int len = name.length();
		for (int i = 0; i < len; i++) {
			System.out.println( name.charAt(i)   );
		} // for

		// 문자열 다루는 메서드(함수)
		// 1. split()
		// 2. length()
		// 3. charAt()
		// 4. valueOf()
		// 5. toString()
		// 6. toCharArray()   String-> char[] 반환하는 메서드

	} // main

} // class








