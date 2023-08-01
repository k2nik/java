package days06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오전 7:56:45
 * @subject  
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 복습.
		int a = 5, b = 7, c = 1;
		
		// [3] Math.max(), min()
		// int max =  Math.max(a, b);
		// max     =  Math.max(max, c);
		
		int max = Math.max(  Math.max(a, b) , c );
		int min = Math.min(  Math.min(a, b) , c );
		
		
		// [2] 삼항연산자
		// int max = a > b ? ( a > c ? a : c ) : (  b > c? b : c);
		
		
		/* [1] 중첩 if
		if ( a > b ) {
			if( a > c ) {				
				a
			}else {
				c
			}
		} else {
			if( b > c ) {				
				b
			}else {
				c
			}
		} // if
		*/
		
		
		
		
	} // main

} // class








// 이준희( 1:20 외출(고용센터) )
