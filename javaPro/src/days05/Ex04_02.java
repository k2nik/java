package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오후 2:14:40
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 1~10 합 for
		//[문제] 두 정수 n, m 을 입력받아서
		// 두 정수 사이의 합을 출력.
		// 예)  2,5
		// 2+3+4+5=14
		// > n, m input ? 5 2
		//		=0


		int n, m, sum = 0;

		try ( Scanner scanner = new Scanner(System.in) ){
			System.out.print("> n, m input ? ");
			n = scanner.nextInt();
			m = scanner.nextInt();

			// [1]
			/*
			if (n > m) {
				for (int i = m; i <= n; i++) {
					sum += i;
					System.out.printf("%d+", i);
				} // for
			} else { 
				for (int i = n; i <= m; i++) {
					sum += i;
					System.out.printf("%d+", i);
				} // for
			} // if
			 */

			// [2]
			/*
			if( n > m ) {
			  int temp = n;
			  n = m ;
			  m = temp;
			} // if

			for (int i = n; i <= m; i++) {
				sum += i;
				System.out.printf("%d+", i);
			} // for
			 */

			// [3]
			/*
			int min = n > m ? m : n;
			int max = n > m ? n : m;
			for (int i = min; i <= max; i++) {
				sum += i;
				System.out.printf("%d+", i);
			} // for
			 */

			// [4] Math클래스 - 수학관련된 메서드(기능) 
			//     Math.random()
			//     Math.min()
		    //     Math.max()			
			int min = Math.min(n, m);
			int max = Math.max(n, m);
			for (int i = min; i <= max; i++) {
				sum += i;
				System.out.printf("%d+", i);
			} // for


			System.out.printf("=%d\n", sum);

		} catch (Exception e) {
			e.printStackTrace();
		} // catch


	} // main

} // class







