package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오전 10:30:24
 * @subject  [복습6번 풀이]
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// [2]
		String name = "kenik";
		char [] nameArr = name.toCharArray();
		System.out.println( nameArr[0] );
		
		
		/* [1] 직접 배열 선언 후 for문 사용해서 처리.
		String name = "kenik";
		// String -> char[] 변환 -> char 배열[0]
		char [] nameArr = new char[name.length()];
		// [k][e][n][i][k]
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] =  name.charAt(i);
		} // for
		
		// nameArr[0]   'k'
		*/
		
		 
	} // main

} // class








