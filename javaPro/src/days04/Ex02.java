package days04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// String String.trim()
		/*
		String sKor = " 90   "; // "90"
		int kor = Integer.parseInt(sKor.trim());
		System.out.printf("kor=%d\n", kor);
		*/
		
		/*
		char cu = 'A';
		char cl = (char) (cu + 32);
		*/

		/*
		int x = 5, y = 10;
		int max =  x > y ? x : y;
		System.out.printf("max=%d\n", max);
		*/ 
		
		Scanner scanner = new Scanner(System.in);
		double x ;		
		System.out.print("> 실수 입력 ? "); // 314
		x = scanner.nextDouble();
		
		// 연산자 우선순위   cast 연산자  >  /(산술)
     	x = (int)(x * 100 + 0.5)/100d;
		
		System.out.printf("> 결과 : %f", x ); 

	} // main

} // class







