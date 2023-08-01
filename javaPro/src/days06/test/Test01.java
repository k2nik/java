package days06.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		
		int a = 5, b = 7, c = 1;		
		int max =  IntStream.of(a,b,c).max().getAsInt();
		System.out.println( max );
		
		// 1-2. 100개의 정수 중 가장 큰값, 작은 값 출력.

		// 문자열 섞기
		/*
			String str1 = "aaaaa", str2 = "bbbbb";
			System.out.println(solution(str1, str2));
		 */

		// 문자 리스트를 문자열로 변환하기
		String[] arr = {"a","b","c"};
		System.out.println( solution(arr) );

	}

	public static String solution(String[] arr) {
		String answer = "";
		// answer = String.join("", arr);

		/* [1]
	        List<String> list = Arrays.asList(arr);
	        Stream<String> strStream = list.stream();
		 */

		// [2]
		Stream<String> strStream = Stream.of(arr);

		return answer;
	}

	// 문자열 섞기
	/*
		public static String solution(String str1, String str2) {
	        String answer = "";

	        for (int i = 0; i < str1.length(); i++) {
				answer += str1.charAt(i);
				answer += str2.charAt(i);
			} // for
	        return answer;
	    }
	 */

} 