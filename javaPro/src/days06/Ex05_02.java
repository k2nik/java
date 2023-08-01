package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오후 12:06:48
 * @subject   제어문 활용
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int n;
		
		try (Scanner scanner = new Scanner(System.in)){ 
			
			System.out.print("> 정수(n) 입력 ? ");
			String inputData = scanner.nextLine();
			  
			// 비밀번호   8~15 , 숫자 1, 알대1, 알소1, 특수문자 1
			
			// 정규 표현식( regular experssion ) 
			// 0~9 숫자로만 이루어진 문자열 체크하는 정규표현식
			// String regex = "^[0-9]+$";
			// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
			String regex = "^\\d+$";
			boolean flag = inputData.matches(regex);
			
			 
			if ( flag ) {   
				n =  Integer.parseInt(inputData);
				System.out.println( n );
			} else {
				System.out.println("입력 잘못!!!");				
			} // if
			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	} // main

} // class








