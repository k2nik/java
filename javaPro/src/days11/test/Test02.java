package days11.test;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Test02 {

	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max = m[0] , count = 1;
		for (int i = 1; i < m.length; i++) {
			if( max == m[i] ) count++;
			else if( max < m[i] ) {
				max=m[i];
				count=1;
			}
		} // for
		System.out.printf("> max:%d, count:%d\n", max, count);
		
		
		//int max = IntStream.of(m).max().getAsInt();
		 
		/* [1]
		long count = IntStream.of(m).filter(i->i==max).count();		
		System.out.println(count);
		*/
		
		/* [2]
		Predicate<Integer> isMax = i->i==max;
		long count = IntStream.of(m).filter(i->isMax.test(i)).count();
		System.out.println(count);
		*/ 
		
		/*
		int index = 0;
		IntStream.of(m).forEach(i-> {
			if(i==max) System.out.println(index);
		});
		*/

	}

}
