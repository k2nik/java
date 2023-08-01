package days06.test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Test01_02 {
	
	public static void main(String[] args) {
		
		int [] m = { 3,5,2,4,1 };
		
		/*
		IntStream iStream = IntStream.of(m); 
		// System.out.println( iStream.count() );
		// System.out.println( iStream.sum() );
		// System.out.println( iStream.average().getAsDouble() );
		// System.out.println( iStream.max().getAsInt() );
		// System.out.println( iStream.min().getAsInt() );
		*/
		
		IntStream.of(m).max().ifPresent(System.out::println);
		IntStream.of(m).min().ifPresent(System.out::println);
		
		
		/*
		IntStream is = new Random().ints(0, 101).limit(5);
		//is.forEach(System.out::println);
		int [] kors = is.toArray();
		System.out.println( Arrays.toString(kors) );
		
		// int [] kors = new Random().ints(0, 101).limit(5).toArray();
		 * 
		 *
		int a = 5, b = 7, c = 1;		
		int max =  IntStream.of(a,b,c).max().getAsInt();
		System.out.println( max );

		int [] m = IntStream.of(2,3,1,3,44).distinct().filter(i->i%2==0).toArray();
		System.out.println( Arrays.toString( m ));

        [정렬 sort]
		int [] m = { 3,5,2,4,1 };
		m = IntStream.of(m).sorted().toArray();
		System.out.println( Arrays.toString(m) );
		
		[합 sum()]
		int [] m = { 3,5,2,4,1 };
		int sum = IntStream.of(m).sum();
		System.out.println(sum);
		
		[필터]
		int [] m = { 3,5,2,4,1 };
		m = IntStream.of(m).filter(i->i>=3).toArray();
		System.out.println(Arrays.toString(m));
		*/
	} // main

}
