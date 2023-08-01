package days05;

/**
 * @author kenik
 * @date 2023. 7. 19. - 오후 4:34:30
 * @subject  while문과 do~while문의 차이점.
 * @content
 */
public class Ex07_02 {
	
	public static void main(String[] args) {
		int i = 10;
		while (i < 2 ) {
			// A
		} // while
		
		do {
			System.out.println("B");
		} while ( i < 2 );

	} // main
}
