package days10;

import java.util.Arrays;

/**
 * @author kenik
 * @date 2023. 7. 26. - 오전 7:36:52
 * @subject
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		int n = 125;  // 0x7D       
		
		// 0123456789A(10)BCDEF(15)
		int share, reminder;
		
		//            0    1    2    3    4     5 
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};		
		String s = "";		 
		while ( n!=0 ) {
			share = n / 16;
			reminder = n % 16; 
			s = ch[reminder] + s; 
			n = share;
		} // while
		
		System.out.printf( "0x%s" , s );
		 
	} // main
	
	

} // class













