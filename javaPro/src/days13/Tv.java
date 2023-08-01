package days13;

// Tv 클래스 선언
class Tv {
	
	// public Tv() {}
	
	// 중첩클래스
	/*
	class Box{
		
	}
	*/

//Illegal modifier for the class Tv; only public, abstract & final are permitted
//private class Tv {
	
	// 멤버
	// 멤버변수(필드 field)
	//    초기화 하지 않으면 각 자료형의 기본값으로 초기화되어져 있다.
	// 선언형식 : [접근지정자] [기타제어자] 자료형 필드명 [= 초기화];
	/*
	public String color = null;
	public boolean power = false;
	public int channel = 0;
	*/
	public String color ;
	public boolean power ;
	public int channel ;
	
	// 멤버함수(메서드 method)
	public void power() {
		power = !power;
	}
	// △
	public void channelUp() {
		channel++;
	}
	// ▽
	public void channelDown() {
		channel--;
	}

}
