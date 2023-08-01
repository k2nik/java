package days04;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오후 4:17:29
 * @subject  컴퓨터 - 사용자(user) 가위,바위,보 게임 ...
 * @content
 */
public class Ex10_04 {

	public static void main(String[] args) {
		 
		int com , user; 
		
		try ( Scanner scanner = new Scanner(System.in) ) {
			System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
			 
			user = scanner.nextInt();
			com =  (int)(Math.random()*3)+1;
			 
		
			// 1    ,2     ,3
			// 가위  바위  보
			/*
			String [] rockPaperScissors = new String[4];
			// [가위][바위][보]          ->  []
			// r[0]   1      2
			rockPaperScissors[0] = "";
			rockPaperScissors[1] = "가위";
			rockPaperScissors[2] = "바위";
			// ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			rockPaperScissors[3] = "보";
			*/
			
			// 1,2,3                        0       1      2      3
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
			
			// scanner.close() 자동
		} catch (Exception e) {
			e.printStackTrace();
		} // catch


	} // main

} // class









