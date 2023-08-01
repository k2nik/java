package days14;

public class Person {
	
	// 필드
	private String name;
	private int age;
	private boolean gender;
	
	// [ Alt + Shift +S ] context menu	
	public Person() { }
	
	public Person(boolean b) {
		gender = b;
	}

	// getter, setter 선언
	public void setAge(int n) {
		if ( 0 <= n && n <= 130 ) {
			age = n;
		} else {
			// 강제로 예외(오류)를 발생
			// [예외처리] throw 문 - 강제로 예외 던지다
			throw new RuntimeException("Person.age 0~130 실행오류!!!");
		} // if
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// gender 필드는 읽기 전용으로만 사용
	public boolean isGender() {
		return gender;
	}
 
//	public void setGender(boolean gender) {
//		this.gender = gender;
//	}
 	
	public int getAge() {
		return age;
	}

} // class
