package days14;

/**
 * @author kenik
 * @date 2023. 8. 1. - 오전 6:55:01
 * @subject
 * @content
 */
public class Ex01 {
	
	// 필드 
	String message = null; 
	
	// 디폴트 생성자 선언
	public Ex01() {
		System.out.println("> Ex01 디폴트 생성자.");
		message = "안녕"; // 생성자로 필드 초기화
	}
	
	public Ex01(String msg) {
		System.out.println("> Ex01 1 생성자.");
		message = msg;
	}

	// 메서드
	public static void main(String[] args) {
		
		// 객체명.필드명
		// [객체 생성 + 디폴트 생성 호출]
		// The constructor Ex01() is undefined
		Ex01 obj = new Ex01();
		// obj.message = "어떤 메시지...";
	    // The constructor Ex01(String) is undefined
		
		
		// [객체 생성 + 1개 생성자 호출]
		//Ex01 obj = new Ex01("원하는메시지");
		
		System.out.println( obj.message );
		
		
		/*
		 * [시험1] - 생성자(Constructor)
		 * 1. 일종의 메서드이다. ( 생성자메서드 )
		 * 2. 메서드명 == 클래스명 
		 * 3. 리턴자료형을 사용하지 않는다.  return문 X
		 * 4. 매개변수가 없는 생성자를 디폴트 생성자(default constructor)라고 한다. 
		 * 5. 접근지정자  p,p,d,p  , 기타제어자 X
		 * 6. 생성자는 인위적으로 호출할 수 없다. 
		 *     객체명.생성자메서드() X
		 *    언제 호출 시기 : 객체 생성할 때 자동으로 호출된다. 
		 *     예) new Ex01(); -> 생성자 호출
		 * 7. 생성자 역할 : 객체 생성할 때 -> 생성자 호출 -> 필드 초기화  
		 * 8. 생성자는 오버로딩이 가능( 중복 선언 )  
		 * 9. 클래스 선언 시 생성자를 1개라도 선언하지 않으면 컴파일러가 자동으로 디폴트 생성자를 추가 후 컴파일 한다.
		 * 10. 디폴트 생성자를 선언하지 않고
		 *     생성자를 오버로딩할때 주의사항. 
		 * 11. 생성자는 상속되지 않는다. ( 단순 암기 )    
		 * */
		
		
	} // main

} // class











