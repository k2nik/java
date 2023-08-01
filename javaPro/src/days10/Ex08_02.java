package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik
 * @date 2023. 7. 26. - 오후 4:43:05
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		 
		// 람다식과 스트림
		int [] score = new Random().ints(20, 0, 101).toArray();
		
		System.out.println( Arrays.toString( score ) ) ;
		 
		 
	} // main

} // class
