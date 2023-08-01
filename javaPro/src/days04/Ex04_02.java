package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오전 11:44:15
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		 
		int kor;
		try( Scanner scanner = new Scanner(System.in) ){
			
			System.out.print("> 국어 점수 입력 ? ");
			kor = scanner.nextInt(); 
			// 중첩if문
			// The operator <= is undefined for the argument type(s) boolean, int
			char grade = '가';
			
			if ( 0 <= kor && kor <= 100 ) {
				// 수우미양가 등급
				if ( 90 <= kor) {
					//System.out.println("수");
					grade = '수';
				}else if ( 80 <= kor ) {  // kor = 88
					//System.out.println("우");
					grade = '우';
				}else if (70 <= kor ) {
					//System.out.println("미");
					grade = '미';
				}else if (60 <= kor) {
					//System.out.println("양");
					grade = '양';
				}else {
					//System.out.println("가");
					grade = '가';
				} // if
				System.out.printf("kor=%d(%c)", kor, grade);
				
			} else {
				System.out.println("국어 점수 입력 잘못!!!");
			} // if
			
			
		} catch (Exception e) { 
			e.printStackTrace();
		} // catch

	} // main

} // class






