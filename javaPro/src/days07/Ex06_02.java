package days07;

/**
 * @author kenik
 * @date 2023. 7. 21. - 오후 12:12:24
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10=-5 ( 시험 )
		// [ 스위치 변수 선언 코딩 ]
		boolean sw = false; // 기본값  false
		int sum = 0;
		for (int i = 1; i <= 10; i++) {  
			/*
			if (sw) { // 짝수
				sum -= i;
				System.out.printf("%d+", i);
				//sw = false;
			} else { // 홀수
				sum += i;
				System.out.printf("%d-", i);
				//sw = true;
			} // if  
			*/
			sum += sw ? -i : i;
			System.out.printf(sw?"%d+":"%d-", i);
			sw = !sw;
		} // for
		System.out.printf("=%d\n", sum); 

	} // main

} // class




