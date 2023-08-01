package days09.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test06 {

	public static void main(String[] args) {
		int [] binaryArr = new int[32];		
		int n = 10;
		int share, remider;
		int index = binaryArr.length - 1;
		
		while ( n != 0) {
			share = n / 2;
			remider = n % 2;		
			// System.out.println(remider);
			binaryArr[index--] = remider;
			n = share;
		} // while
		
		IntStream.of(binaryArr).forEach(a->{
			System.out.printf("%d",a);
		});
		
		
		 
	}

}
