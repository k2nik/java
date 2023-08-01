package days07.test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		int com , user; 
		char con = 'y';
		String inputData;
		int inputCount = 1;

		try ( Scanner scanner = new Scanner(System.in) ) {

			do {
				
				// user = scanner.nextInt();
			    do {
			    	if( inputCount != 1 ) System.out.println("< 입력잘못(1~3)!!! 다시 입력하세요.");
			    	System.out.printf("> [%d] : user 가위(1),바위(2),보(3) 선택 ? ", inputCount
			    			++);
			    	inputData = scanner.next();
				} while (!inputData.matches("^[1-3]$"));
				
			    user = Integer.parseInt(inputData);
				com =  (int)(Math.random()*3)+1;

				String [] rockPaperScissors = { "",  "가위", "바위", "보" };

				System.out.printf("> 컴퓨터:%s, 사용자:%s\n"
						, rockPaperScissors[com], rockPaperScissors[user]);

				switch (user - com) {
				case 1: case -2:
					System.out.println("사용자 승리");
					break;
				case 2: case -1:
					System.out.println("컴퓨터 승리");
					break; 
				default:   
					System.out.println("무승부");
					break;
				} // switch

				// 추가 코딩
				System.out.print("> 계속할까요? ");
				con = (char)System.in.read();
				System.in.skip( System.in.available() );
			} while ( con=='y' || con=='Y');
			
			System.out.println(" 종료~ ");


		} catch (Exception e) {
			e.printStackTrace();
		} // catch


	} // main

} // class
