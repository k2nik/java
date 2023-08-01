package days10.test;

public class Test02_02 {
	
	public static void main(String[] args) {
		 int n = 125;		 
		 int share, reminder;
		 
		 String hex = "0123456789ABCDEF";
		 StringBuilder sb = new StringBuilder();
		 
		 while (n!=0) {
			share = n / 16;
			reminder = n % 16;
			
//			System.out.println( reminder );
			System.out.println( hex.charAt(reminder) );
			sb.append(hex.charAt(reminder));
			n = share;
		} // while
		 
		String strHex = sb.reverse().toString();
		System.out.printf("%d -> 0x%s\n", 125, strHex);

	} // main
	
}
