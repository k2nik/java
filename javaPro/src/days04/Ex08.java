package days04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// if  조건문
		// for 반복문
		// switch 분기문
		
		// key : 변수, 수식 ( 정수, 문자열, 문자 )
		// value : 리터럴,   변수 X
		/*
		switch (key) {
		case value:			
			break;
		case value:			
			break;
		case value:			
			break;
           :   
		[ default:
			break; ]
		} // switch
		*/
		
		// Ex03_02.java 복사+붙이기
		// 정수를 입력받아서 짝수,홀수 출력 - if/ifelse문
		int n;
		
		try (Scanner scanner = new Scanner(System.in);) {
			
			System.out.print("> 정수입력 ? ");
			n = scanner.nextInt();
			
			String result = null;
			switch (   n%4  ) {
				case 0:		
					result = "짝수";
					break;
	            case 1:
	            	result = "홀수";
					break;
				// default:	
			} // switch
			
			// The local variable result may not have been initialized
			System.out.println( result );
			
		} catch (Exception e) { 
		} // catch 
		System.out.println(" end ");

	} // main

} // class







