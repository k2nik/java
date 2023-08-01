package days05;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오전 10:30:24
 * @subject  [복습6번 풀이]
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 한 문자 입력...
		char one;
		// BufferedReader br
		// Scanner scanner
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("> 한 문자 입력 ? ");  
			// scanner.next();      String
			
			// scanner.nextByte();  byte
			// scanner.nextShort(); short
			// scanner.nextInt();   int
			// scanner.nextLong();  long
			
			// scanner.nextBoolean(); boolean
			
			// scanner.nextFloat(); float
			// scanner.nextDouble(); double
			
			//  "a"= 'a' '\0' -> 'a' 변환 X
			
			String inputData = scanner.next(); // "a"
			one = inputData.charAt(0);  // 'a'
			
			if ( '0' <= one && one <='9') {
				System.out.println("숫자");
			}else if ( ('a' <= one  && one <= 'z')  ||  ('A' <= one  && one <= 'Z') ) {
				System.out.println("알파벳");
			} else if ( '가' <= one  && one <= '힣' ) {
				System.out.println("한글");
			 } else if ( one == '#' || one == '$' || one == '!' || one == '@') {  // #$!%@
				System.out.println("특수문자");
			}else {
                System.out.println("X"); 
			} // if
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		

	} // main

} // class








