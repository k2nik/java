package days05;

import java.io.IOException;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오후 4:09:08
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) throws IOException {
		
		
		int code ;
		char one;

		// [1]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", code);
		//one = (char) code;
		//System.out.printf("one = %c\n", one);

		//System.in.read(); // 13
		//System.in.read(); // 10
		System.in.skip(  System.in.available()  );
		
		// [2]
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %d\n", code);
		//one = (char) code;
		//System.out.printf("one = %c\n", one);


	} // main

} // class








