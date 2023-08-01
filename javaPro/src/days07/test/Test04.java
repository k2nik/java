package days07.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int rows = 5; // 행 갯수 저장 변수		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> 행의 갯수를 입력하세요 ? ");
	    rows = scanner.nextInt();
	    
		int cols = 2*rows - 1;
		
		for (int i = 1; i <= rows; i++) {
			System.out.printf("%d : ", i);
			for (int j = 1; j <= cols; j++) {
				if( i+j>=1+rows && j-i <=rows-1 ) { System.out.print("*");}
				else { System.out.print("_");}
			} // for
			System.out.println();
		} // for
		
	} // main 

} // class
