package days14;

import days13.Point;

/**
 * @author kenik
 * @date 2023. 8. 1. - 오전 10:34:44
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) { 
		// days13.Ex10.java
		// The constructor Point(int, int) is undefined
		Point p1 = new Point(1, 2); // 객체 생성할 때 필드 초기화
		//p1.x = 1;
		//p1.y = 2;
		 
		Point p2 = p1.plusPoint(p1);
		p2.dispXY();		
		
		p2 = p1.plusPoint();
		p2.dispXY();
		

	} // main

} // class
