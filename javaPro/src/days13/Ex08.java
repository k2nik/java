package days13;

/**
 * @author kenik
 * @date 2023. 7. 31. - 오후 2:34:53
 * @subject
 * @content
 */
public class Ex08 {
	
	// 필드
	// 인스턴스변수
	public int age;

	public static void main(String[] args) {
		String name; // 지역변수
		/*
		 * [ JVM 의 메모리 구조 ]
		 *  응용프로그램 -> JVM 실행 ->   응용프로그램이 사용할 메모리 할당한다. 
		 *  메모리를 용도에 따라 영역 나누어서 관리한다. 
		 *  1) Call Stack ( 스택영역 )
		 *     호출 스택
		 *     메서드의 작업에 필요한 메모리 공간 제공.
		 *     지역변수, 매개변수 
		 *  2) Heap( 동적 영역)
		 *     new 객체생성() 즉, 인스턴스 생성되는 공간.
		 *  3) Method Area
		 *     클래스 파일(??.class) 에 대한 정보 저장
		 *     클래스 변수 저장
		 *     클래스,인터페이스 정보 저장 영역,   클래스(static) 변수 , 메서드 등록
		 *     
		 *     
		 * [자바 변수는 선언되는 위치에 따라 3가지 종류]
		 * 
		 *     1. 지역변수
		 *     2. 필드
		 *        1) 인스턴스 변수
		 *        2) 클래스 변수  X
		 */

	} // main

} // class
