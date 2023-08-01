package days08;

/**
 * @author kenik
 * @date 2023. 7. 24. - 오전 11:10:41
 * @subject 지역변수 개념
 * @content
 * 
 *         함수 호출 + 매개변수 가지고
 *         1) Call By Name             drawLine();
 *         2) Call By Value            sum(1,2)
 *         3) Call By Reference
 *         4) Call By Point            X 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// main  지역변수 x, y 
		// int x = 10, y = 20;
		// 배열 초기화
		int [] m = { 10, 20 }; // m[0]=10, m[1]=20
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);
		 
		// Call By Value  X
		// Call By Reference .main 함수의 x,y 참조
		// 매개변수를 참조타입을 사용하겠다.- 배열, 클래스, 인터페이스
		swap( m );   // 0x100 배열 시작주소
		
		System.out.printf("> x=%d, y=%d\n", m[0], m[1]);

	} // main

	// swap 함수 선언 부분
	//                         지역변수  int [] m = 0x100
	public static void swap( int [] m) {
		 
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		 
	}

} // class






