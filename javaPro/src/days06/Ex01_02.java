package days06;

import java.util.Arrays;
import java.util.Random;

public class Ex01_02 {
	
	public static void main(String[] args) {
		
		// [문제] 10개 정수를 임의의 값(5~15)으로 저장-> 가장큰값
		// [문제] 10개 정수를 임의의 값(0~10)+5으로 저장-> 가장큰값
		// 5 <= (int)(Math.random()*11)+5 < 16
		
		Random rnd = new Random(); 
		
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			// m[i] = (int)(Math.random()*11)+5;
			m[i] = rnd.nextInt(11)+5;
		} // for
		
		// m 배열의 각 요소를 출력(확인)
		System.out.println(   Arrays.toString( m  )    );
		
		// int max = m[0];
		// int min = m[0];
		int max, min;
		max = min = m[0];
		
		for (int i = 1; i < m.length; i++) {
			if ( max < m[i] ) {
				max = m[i];
			} else if ( min > m[i] ) {
				min = m[i];
			} // if
		} // for
		
		System.out.println( max +" / " + min );
		
	} // main

} // class






