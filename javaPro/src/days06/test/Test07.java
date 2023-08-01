package days06.test;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kenik
 * @date 2023. 7. 20. - 오후 4:19:16
 * @subject
 * @content
 */
public class Test07 {

	public static void main(String[] args) {
		
		/*
		IntStream intStream = new Random().ints(1, 46);
		Stream<String> lottoStream = intStream.distinct().limit(6).sorted().mapToObj(lottoNumber -> lottoNumber+", ");
		lottoStream.forEach(System.out::print);
		*/
		
		/*
		IntStream intStream = "2594567".chars();
		int sum = intStream.map(ch->ch-'0').sum();
		System.out.println(sum);
		*/
		
		IntStream ist = IntStream.of(3,5, 2, 4, 1);		
		//System.out.println( ist.sum() );
		//System.out.println( ist.count() );
		//System.out.println( ist.max() );
		//System.out.println( ist.average() );
		//System.out.println( ist.filter(i->i>=2) );
		//ist.sorted().forEach(System.out::println);
		
		

	} // main

} // class
