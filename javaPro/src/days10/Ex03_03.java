package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2023. 7. 26. - 오후 12:13:57
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		// 1.Arrays.copyOfRange()
		int [] arr = {1,2,3,4,5};		
		int [] arrCopy = Arrays.copyOfRange(arr, 2, 4);		
		System.out.println( Arrays.toString( arrCopy ));
		// .
		
		int [] m = new int[3];
		m[0]=5;
		m[1]=3;
		m[2]=7;
		// m     [1][2][3][4][5]
		// temp  [][][][][2][3][][]
		int index = 3;
		
		 
		if( index == m.length ) {
			int [] temp = new int[  m.length + 3  ]; 
			//System.arraycopy(m, 0, temp, 4, 2);
			System.arraycopy(m, 0, temp, 0, m.length);
			// Arrays 클래스 : 배열을 다루기 쉽도록 기능이 구현된 클래스
			m = temp;
		} // if
		 
		m[3]=10;
		System.out.println( Arrays.toString(m) );

	} // main

} // class
