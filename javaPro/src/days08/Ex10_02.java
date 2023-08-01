package days08;

public class Ex10_02 {

	public static void main(String[] args) {
		// 5:05 수업시작~
		String rrn = "830412-1700001";
		 
		String [] rrnArr = rrn.split("-");
		// 830412-1******
		System.out.printf("%s-%c******\n",rrnArr[0], rrn.charAt(7) );
		System.out.printf("%s-%c******\n",rrnArr[0], rrnArr[1].charAt(0) );
		
		System.out.println(  rrn.substring(0,  8)+"******"   );
		
		// 830412-******* 
		System.out.printf("%s-*******\n",rrnArr[0] );

	} // main

} // class
