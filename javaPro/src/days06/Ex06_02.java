package days06;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오후 12:38:05
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		// [구구단] while문 사용 변경
		int dan = 2;
		int i = 1;
		while (dan <= 9) {  // dan 2~9
			i=1;
			System.out.printf("[%d단]\n", dan);			
			//i=1;
			while( i <= 9 ) {
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
				i++;
			} // while			
			dan++;
			//i=1;
		} // while
		 
	} // main

} // class




















