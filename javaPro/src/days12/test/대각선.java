package days12.test;

import java.util.Arrays;

public class 대각선 {

	public static void main(String[] args) {
//		[01][02][04][07][11]
//		[03][05][08][12][16]
//		[06][09][13][17][20]
//		[10][14][18][21][23]
//		[15][19][22][24][25]
						
		int [][] m = new int[5][5];
		 
		int n = 1;
		int row = 0, col = 0;
		// 입력
		for (int i = 0; i < m.length*2-1; i++) {  // 회전
			row =  i >= m.length ? i-m.length+1: 0;
			col =  i >= m.length ? m.length-1 : i; 
			do {
				m[row][col]=n++;
				row++; col--;
			}while(col>=0 && row < m.length) ;
		} // for
		// 출력
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
		 

		/*
		// [3]
		for (int i = 0, diff = 1; i < m.length; i++, diff++) {
			for (int j = 0; j < m[i].length; j++) {
				//m[i][j] = ( m[i-1<0?0:i-1][0]+diff ) + (j==0?0:i+j);
				m[i][j] = ( m[i-1<0?0:i-1][j]+diff )+j;
				//m[i][j] = (j==0?0:i+j);
			} // for
		} // for

		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		} // for

		 */

		/*
		   0 1 2 3 4 
		0  0 1 2 3 4  
		1  0 2 3 4 5
		2  0 3 4 5 6 
		3  0 4 5 6 7 
		4  0 4 5 6 7 
		 */
		/* [2]
		for (int i = 0, diff = 1; i < m.length; i++, diff++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = ( m[i-1<0?0:i-1][j]+diff );
			} // for
		} // for

		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		} // for

//		[1, 1, 1, 1, 1]
//		[3, 3, 3, 3, 3]
//		[6, 6, 6, 6, 6]
//		[10, 10, 10, 10, 10]
//		[15, 15, 15, 15, 15]
		 */ 

		/* [1]
		int [] m = new int[5];
		for (int i = 0, diff=1; i < 5; i++, diff++) {
			m[i] = m[i-1<0?0:i-1]+diff ;
		} // for
		System.out.println( Arrays.toString(m));
		 */
		//   1,3,6,10,15
		// 1  2 3 4 5

	}

}
