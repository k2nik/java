package days06.test;

public class Test03 {

	public static void main(String[] args) {
		int n =15, m = 1 , sum = 0;
		
		int min = n > m ? m : n;
		int max = n > m ? n : m;
		
		for (int i = min%2!=0?min+1:min ; i <= max; i+=2) {
			sum += i;
			System.out.printf("%d+", i);
		} // for
		System.out.printf("=%d\n", sum);

	}

}
