package days09;

/**
 * @author kenik
 * @date 2023. 7. 25. - 오전 11:05:35
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		
		// [ 주민등록번호 ]
		// 1. 주민등록번호(住民登錄番號, 영어: Resident Registration Number, RRN)
		// 2. 생년월일
		//    나이
		//    ㅅ 성별,  세기,  내국인/외국인
		//    검증번호
		String rrn = "990123-1700001";
		
		String birthday = getBirth(rrn);		
		System.out.println( birthday );
		
		

	} // main
	
	// ㅅ
	public static int getGender(String rrn) {
		//return  Integer.parseInt(rrn.substring(7, 8));
		return rrn.charAt(7)-'0';     // '0' 48
	}

	public static String getBirth(String rrn) {
		// rrn = "890123-1700001"
		int year =  Integer.parseInt( rrn.substring(0, 2) );
		int month = Integer.parseInt( rrn.substring(2, 4) );
		int day = Integer.parseInt( rrn.substring(4, 6) );
		// System.out.printf("%s.%s.%s\n", year, month, day);
		// "1999.01.23"
		// 1800, 1900, 2000
		int ㅅ = getGender(rrn);
		
		int centry = 1800;
		switch ( ㅅ ) {
			case 1: case 2: case 5: case 6:
				centry = 1900;
				break;
			case 3: case 4: case 7: case 8:
				centry = 2000;
				break;
			case 9: case 0 :
				centry = 1800;
				break;
		} // switch
		year = centry + year;
		String birthday = String.format("%d.%d.%d", year, month, day);
		
		return birthday;
	}

} // class






