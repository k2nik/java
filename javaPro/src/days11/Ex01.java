package days11;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2023. 7. 27. - 오전 7:06:55
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		// max
		int max = m[0];
		for (int i = 1; i < m.length; i++) {
			if( max < m[i]) max = m[i];
		} // for
		
		System.out.printf("max = %d\n", max);
		
		// index =   1, 7, 15
		/*
		String s = "inex = ";
		for (int i = 0; i < m.length; i++) {
			if( max == m[i]) s += i +", ";
		} // for
		System.out.println( s.substring(0, s.length()-2) );
		*/
		
		// 배열 추가.
		int [] maxIndexArr = new int[m.length];
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if( max == m[i])  maxIndexArr[index++] = i  ;
		} // for
		System.out.println( Arrays.toString( maxIndexArr ));
		
	    // String.join(null, args)
		// index =   1, 7, 15
		int [] arr = Arrays.copyOf(maxIndexArr, index);
		System.out.println( Arrays.toString(arr) );
		
		String s = "inex = ";
		for (int i = 0; i < arr.length; i++) {
			s += arr[i] +", ";
		} // for
		System.out.println( s.substring(0, s.length()-2) );
		
		
		
	} // main

} // class








