package days13.test;

public class Test03 {

	public static void main(String[] args) {
		int [][] m = new int[5][5];
		int v = 1;
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-1; j++) {
				m[i][j] = v++;
				
				m[i][4] += m[i][j] ;
				m[4][j] += m[i][j] ;
				m[4][4] += m[i][j] ;
			} // for
		} // for
		
		
		for (int i = 0; i < m.length ; i++) {
			for (int j = 0; j < m.length ; j++) {
				System.out.printf("[%02d]", m[i][j] ); 
			} // for
			System.out.println();
		} // for

	}

}
