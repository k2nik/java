package days04;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오후 2:00:30
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		int sum=0;
		// i=1,2,3,4,5,6,7,8,9,10
		for(int i=1; i<=10; i++){
			// i=1,2,3,4,5,6,7,8,9,10
			if( i == 10 ) {
				System.out.printf("%d", i);
			}else {
				System.out.printf("%d+", i);
			}			
			sum += i;
		} // for
		System.out.printf("=%d\n", sum);

	} // main

} // class
