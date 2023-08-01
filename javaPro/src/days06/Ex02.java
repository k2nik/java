package days06;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		int code ; 
// 		Syntax error on token "continue", invalid Variable Declarator Id
		// 예약어 -> 변수명 사용할 수 없어요. 
		char con = 'y'; 
		do {
			
			System.out.print("> 한 문자 입력 ? ");
			code = System.in.read();
			System.out.printf("code = %c\n", (char)code); 
			
			System.in.skip( System.in.available()  );
			
			System.out.print("\n\n 계속할거냐? ");
			// br , scanner, System.in.read()
			code = System.in.read(); // 'y' 'n'
			con = (char)code;
			
			System.in.skip( System.in.available()  );
			
		} while ( con == 'y' || con == 'Y');
		
		System.out.println(" end ");
	 
		/*
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %c\n", (char)code); 
		// System.in  입력스트림 ['a']['\r' 13]['\n'10]  
		// a 엔터('\r' '\n')
		// 0~255 int  read()  next 1byte
		System.in.skip( System.in.available()  );
		 
		System.out.print("> 한 문자 입력 ? ");
		code = System.in.read();
		System.out.printf("code = %c\n", (char)code); 
		*/

	} // main

} // class
