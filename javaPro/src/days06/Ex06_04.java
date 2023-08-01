package days06;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오후 2:15:21
 * @subject
 * @content
 */
public class Ex06_04 {
	
	public static void main(String[] args) {
		/*
		if(A) {
			if(B) {
				// 
			}
		}
		
		if(A && B) {
			
		}
		*/
		
		
		
		
		//  k=1 [2]  [3][4]
		//  k=2 [5]  [6][7]
		//  k=3 [8]  [9][XXX10XXX]
		// 3*k-1
		
		for (int k = 1; k <=3 ; k++) { 
			for (int dan = 3*k-1; dan <= 3*k+1 && dan != 10; dan++) { 
				  //if( dan != 10)	
				  System.out.printf(" [%d]단\t", dan);
			} // for
			System.out.println();
			for (int i = 1; i <= 9; i++) {				
				for (int dan = 3*k-1; dan <= 3*k+1 && dan != 10; dan++) {					
				   //	if( dan != 10) 
					System.out.printf("%d*%d=%02d\t", dan,i,dan*i);
				} // for
				System.out.println();
				
			} // for			
			System.out.println(); // 개행
		} // for k
		
		
		/*
		for (int k = 1; k <=2 ; k++) { 
			for (int i = 4*k-2; i <= 4*k+1; i++) {
				System.out.printf(" [%d]단\t", i);
			} // for
			System.out.println();
			for (int i = 1; i <= 9; i++) {
				for (int dan = 4*k-2; dan <= 4*k+1; dan++) {
					System.out.printf("%d*%d=%02d\t", dan,i,dan*i);
				} // for
				System.out.println();
			} // for			
			System.out.println(); // 개행
		} // for k
		*/
		
		/*
		for (int i = 2; i <= 5; i++) {
			System.out.printf(" [%d]단\t", i);
		} // for
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 5; dan++) {
				System.out.printf("%d*%d=%02d\t", dan,i,dan*i);
			} // for
			System.out.println();
		} // for
		
		System.out.println(); // 개행
		
		for (int i = 6; i <= 9; i++) {
			System.out.printf(" [%d]단\t", i);
		} // for
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int dan = 6; dan <= 9; dan++) {
				System.out.printf("%d*%d=%02d\t", dan,i,dan*i);
			} // for
			System.out.println();
		} // for
		*/
		
	} // main

} // class








