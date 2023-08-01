package days05;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오후 3:12:41
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 조건문 : if
		// 분기문 : switch
		// 반복문 : for            , foreach(확장for문)
		// 기타 : break, continue
		// 조건반복문 :  while,  do~while
		
		/*   [컬렉션(collection)] 
		[열거자] 반복해서 처리 
		while (en.hasMoreElements()) {
			type type = (type) en.nextElement();
			
		} // while
		*/
		
		/*
		[반복자] 반복해서 처리
		while (it.hasNext()) {
			type type = (type) it.next();
			
		} // while
		*/

		/*
		while (condition) {
			// 조건식이 참일 동안 반복해서 {} 블럭 실행.
		} // while
		*/
		
		// for 반복문과 while 조건반복문의 차이점
		//  반복횟수     반복조건 
		
		// [ 1~10까지 합 ( while문 ) ]
		/* [1]
		int i = 1, sum = 0;
		while ( i <= 10 ) {
			System.out.printf("%d+", i);
			sum += i;
			i++;
		} // while
		System.out.printf("=%d\n", sum);
		*/
		
		// [2] 1+2+3+4+5+6+7+8+9+10+=55
		/*
		int i = 0, sum = 0;
		while ( i < 10 ) {  // 11
			i++; // 11
			System.out.printf("%d+", i); // 1+2+...+11+
			sum += i; // 66
			
		} // while
		System.out.printf("=%d\n", sum);
		*/
		
		// [3]
		int i = 0, sum = 0;
		while ( ++i <= 10 ) {   
		//while ( i++ <= 10 ) {
			System.out.printf("%d+", i); 
			sum += i;   
			
		} // while
		System.out.printf("=%d\n", sum);

	} // main

} // class


/*
if( i==0 ) {
	i++;
	continue;
}
*/





