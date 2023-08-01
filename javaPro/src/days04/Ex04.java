package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오전 11:44:15
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// 국어 점수를 kor 변수에  입력받아서
		// 등급(grade)을 출력
		// 0~59 가
		// 60~69 양
		// 70~79 미
		// 80~89 우
		// 90~100수
		// if 조건문   if ~ else 조건문
		// 11:57~
		int kor;
		try( Scanner scanner = new Scanner(System.in) ){
			
			System.out.print("> 국어 점수 입력 ? ");
			kor = scanner.nextInt(); 
			// 중첩if문
			// The operator <= is undefined for the argument type(s) boolean, int
			if ( 0 <= kor && kor <= 100 ) {
				// 수우미양가 등급
				if ( 90 <= kor) {
					System.out.println("수");
				} // if
				if ( 80 <= kor && kor < 90 ) {  // kor = 88
					System.out.println("우");
				} // if
				if (70 <= kor && kor <= 79) {
					System.out.println("미");
				} // if
				if (60 <= kor && kor <= 69) {
					System.out.println("양");
				} // if
				if ( kor <= 59) {
					System.out.println("가");
				} // if
				
			} else {
				System.out.println("국어 점수 입력 잘못!!!");
			} // if
			
			
		} catch (Exception e) { 
			e.printStackTrace();
		} // catch

	} // main

} // class






