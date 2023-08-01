package days04;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오후 4:23:39
 * @subject
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) { 
		// 0.0*3 <=    Math.random*3   < 1.0*3
		// 1   <=    (int)(Math.random*3)+1   < 4
		// 임의의 수 발생시키는 클래스.메서드 
		for (int i = 0; i < 100000; i++) {
			int v =  (int)(Math.random()*3)+1;
			if( v < 1  || v > 4)
			   System.out.println( v  ); 
		} // for
		
		System.out.println( " end ");

	} // main

} // class









