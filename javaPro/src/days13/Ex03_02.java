package days13;

/**
 * @author kenik
 * @date 2023. 7. 31. - 오전 11:25:17
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		// 배열 에러
		// int [] m = new int[2]; // m[0] m[1]
		// NullPointerException
		int [] m = null;
		// ArrayIndexOutOfBoundsException
		m[2] = 100;
		System.out.println( m[2] );
		

	} // main

} // class






