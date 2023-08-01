package days06.test;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오전 7:49:02
 * @subject
 * @content 참고 : https://blog.naver.com/lovesm135/223004789308
 */
public class Test06 {
	
	public static void main(String[] args) {
		String name = "leechangik";
		char [] nameArr = name.toCharArray();
		for (char c : nameArr) {
			System.out.printf( "\'%c\'\n", c  );
		} // foreach
		
		//name = new String(nameArr);
		name = String.valueOf(nameArr);
		System.out.println( name );
	} // main

}
