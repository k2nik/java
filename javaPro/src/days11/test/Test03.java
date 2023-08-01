package days11.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test03 {

	public static void main(String[] args) {
		// int[] => List 변환~
		
		int [] m =  {3,5,2,4,1};
		int n = 4; 
		
		// [1]
		/*
		List<Integer> list = IntStream.of(m).boxed().collect(Collectors.toList());		
		int index = list.indexOf(n) ;
		
		list.add(index, 100);
		
		System.out.println( list );
		*/
		
		// int [] x = list.stream().mapToInt(Integer::intValue).toArray();

	}

}
