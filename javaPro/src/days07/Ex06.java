package days07;

/**
 * @author kenik
 * @date 2023. 7. 21. - 오후 12:12:24
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 1-2+3-4+5-6+7-8+9-10=-5
		// 홀수   sum+=i    %-
		// 짝수   sum-=i    %+
		int sum = 0;
		for (int i = 1; i <= 10; i++) { 
			 
			sum += i%2==0?-i:i;
			System.out.printf(i%2==0?"%d+":"%d-", i);
			 
			/*
			if (i%2==0) { // 짝수
				sum -= i;
				System.out.printf("%d+", i);
			} else { // 홀수
				sum += i;
				System.out.printf("%d-", i);
			} // if 
			*/
		} // for
		System.out.printf("=%d\n", sum);
		

	} // main

} // class




