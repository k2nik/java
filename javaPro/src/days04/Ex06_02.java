package days04;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오후 2:00:30
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int sum=0;
		// 1+2+3+4+5+6+7+8+9+10=55
		for(int i=1; i<=10; i++){ 
			System.out.printf( i==10? "%d" : "%d+"  , i); 
			sum += i;
		} // for
		System.out.printf("=%d\n", sum);

	} // main

} // class
