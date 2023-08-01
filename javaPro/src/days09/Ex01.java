package days09;

/**
 * @author kenik
 * @date 2023. 7. 25. - 오전 6:53:12
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		int money = 125760;
		int unit = 50000;   
		boolean sw = false; // 스위치 변수
		int count = 0 ;    // 갯수
		while ( unit >= 1 ) {
			count = money / unit;
			System.out.printf("%d원 : %d개\n", unit, count);
			money %= unit;
			//if(sw == false) unit = unit /5;
			//else            unit = unit /2;
			unit /=  !sw ? 5 : 2;			
			sw = !sw;
		} // while
	
		
	} // main

	 

} // class





