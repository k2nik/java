package days14;

/**
 * @author kenik
 * @date 2023. 8. 1. - 오후 2:11:11
 * @subject  [ static 키워드 ]
 * @content  필드 앞에
 *           메서드 앞에
 *           클래스 앞에
 *           
 */
public class Ex07 {

	public static void main(String[] args) {
		// [우리반] -> 기업은행 -> 보통 예금 
		// Save 클래스 선언 : 저축
		//  인스턴스 변수 - 객체명.필드, 객체명.메서드
		//  클래스 변수 - 클래스명.static필드\
		
		// 1. rate 이자율 왜  static 필드로 선언했나요? 
		// == static 필드는 언제 사용하나요 ?
		
		// 2. 정적(static) 메서드 언제 사용하나요 ? 
		 //   1) static 필드를 사용하기 위해서 ... 
		//    2)    3:03 수업시작~ 
		
		
		// The field Save.rate [is not visible]
		// System.out.println( Save.rate );
		
		System.out.println(  Save.getRate() );
		 
		 
		Save s1 = new Save("주강민", 1000, 0.04);
		Save s2 = new Save("정하영", 1500, 0.04);
		Save s3 = new Save("임경재", 34500, 0.04);
		Save s4 = new Save("이지현", 5000, 0.04);
		Save s5 = new Save("이준희", 21000, 0.04);
		
		
		// Save.setRate(0.08);		
		s1.setRate(0.06);		
		
		s1.dispSave();
		s2.dispSave();
		s3.dispSave();
		s4.dispSave();
		s5.dispSave();
	 
		
		// 클래스 배열 선언
		/*
		Save [] ss = new Save[5];
		ss[0] = new Save("주강민", 1000, 0.04);
		ss[1] = new Save("정하영", 1500, 0.04);
		ss[2] = new Save("임경재", 34500, 0.04);
		ss[3] = new Save("이지현", 5000, 0.04);
		ss[4] = new Save("이준희", 21000, 0.04);
		*/
		
		/*
		// 클래스 배열 초기화
		Save [] ss = {
				new Save("주강민", 1000, 0.04),
				new Save("정하영", 1500, 0.04),
				new Save("임경재", 34500, 0.04), 
				new Save("이지현", 5000, 0.04), 
				new Save("이준희", 21000, 0.04)
		};
		
		for (int i = 0; i < ss.length; i++) {
			ss[i].dispSave();
		} // for
		*/
		
		// [파악] 모든 사람의 이자율(rate) 는 동일할 거라고..
		// Save 객체가 생성될 때 마다 rate(8byte) 필드는 X
		// Save 클래스 당  1개만 rate 필드 생성해서 모든
		// 인스턴스(객체)가 공유해서 사용할 필드를 선언....

	} // main

} // class
