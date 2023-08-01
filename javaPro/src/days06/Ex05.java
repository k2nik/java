package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오후 12:06:48
 * @subject   제어문 활용
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		int n;
		
		try (Scanner scanner = new Scanner(System.in)){
			// 문자 X, 실수 X, 정수 입력
			// "12a32"   "3.14"    "1231" 
			System.out.print("> 정수(n) 입력 ? ");
			String inputData = scanner.nextLine();
			char [] idArr = inputData.toCharArray();
			
			boolean flag = false; // 숫자 X -> true
			
			for (int i = 0; i < idArr.length; i++) {
				// if( '0' > idArr[i] ||  idArr[i] > '9')  )
				if( !('0' <= idArr[i] && idArr[i] <= '9')  ) {
					flag = true;
					break;
				}
			} // for
			
			if (!flag) {  // flag == false
				n =  Integer.parseInt(inputData);
				System.out.println( n );
			} else {
				System.out.println("입력 잘못!!!");				
			} // if
			// n = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	} // main

} // class








