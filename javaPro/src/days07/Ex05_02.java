package days07;

/**
 * @author kenik
 * @date 2023. 7. 21. - 오전 11:45:28
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// [정규표현식]
		// 국어점수(kor)을 입력받아서
		//   0<= <=100
		// 올바른 국어점수, 잘못된 국어점수 출력..
		// [ 50~00 ] 쉬는 시간..
		// int [] kors = {  99, 1, 100, 101, -90, 0  };
		
		String kor = "09";
		// String regex = "\\d{3}"; // 100~999
		// String regex = "\\d{1,2}|100"; // 09
		// String regex = "\\d{1}|\\d{2}|100"; // 09
		// String regex = "100|[1-9]\\d|\\d"; // 10~99
		String regex = "100|[1-9]?\\d";	
		System.out.println(   kor.matches(regex)    );
		 
	} // main

} // class







