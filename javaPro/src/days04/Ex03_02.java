package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오전 10:48:00
 * @subject 제어문
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		int n;
		
		try (Scanner scanner = new Scanner(System.in);) {
			
			System.out.print("> 정수입력 ? ");
			n = scanner.nextInt();
			// 10
			String result = "짝수(even number)";
			if (n % 2 != 0) { 
				result = "홀수(odd number)";
			} // if
			/*
			if (n % 2 == 0) {
				//System.out.printf("n=%d 짝수(even number)", n);	
				result = "짝수(even number)";
			} else {
				//System.out.printf("n=%d 홀수(odd number)", n);
				result = "홀수(odd number)";
			} // if
			*/
			
			System.out.printf("n=%d %s", n, result);
		} catch (Exception e) { 
		} // catch 

	} // main

} // class






