package days04;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오후 2:28:11
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// for (초기식; 조건식; 증감식)
		/*
		int sum = 0, i = 1;
		for (      ;      ;      ) {  // 무한 루프
			if( i > 10 ) break;
			System.out.printf("%d+", i); 
			sum += i;  
			i++;
		} // for
		*/
		
		/*
		int sum = 0 ;		
		for ( int i=1, j=1, k=10 ; i<=10  && k <=10 || j > -100 ;  i++ , j--, k+=5 ) {  
			System.out.printf("%d+", i); 
			sum += i;   
		} // for
		*/
		
		// [문제] 1~10 합을 출력하세요. 
		int sum = 0 ;		
		
		for ( int i=10 ; i>=1 ;  i-- )  ; 
		
		
		{  
			//System.out.printf("%d+", i); 
			//sum += i;
			System.out.println("test");
		} // for
		
		// Unreachable code
		System.out.printf("\b=%d\n", sum);
		
		
		// System.out.println( i );


	} // main

} // class






