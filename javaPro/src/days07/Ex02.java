package days07;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 21. - 오전 9:32:41
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [복습2]
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이등변 삼각형 행 갯수 ? ");
		int row = scanner.nextInt();
		// 행->열
		// 3->5
		// 4->7
		// 5->9
		// n -> 2*n-1 포인트
		int col = 2*row-1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if( i+j>= row+1 && j-i <= row-1) System.out.print("*");
				else System.out.print("_");
			} // for
			System.out.println();
		} // for
		
		
		
		
		
		
		scanner.close();
		System.out.println(" end ");
		
//		*
//		**
//		***
//		****
		
		// String.repeat()
		/*
		System.out.println( "*".repeat(1)  );
		System.out.println( "*".repeat(2)  );
		System.out.println( "*".repeat(3)  );
		System.out.println( "*".repeat(4)  );
		*/ 
		/*
		for (int i = 1; i <=4 ; i++) {
			System.out.println( "*".repeat(i)  );
		} // for
		*/

	} // main

} // class






