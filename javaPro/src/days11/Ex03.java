package days11;

import java.util.ArrayList;

/**
 * @author kenik
 * @date 2023. 7. 27. - 오전 11:28:20
 * @subject
 * @content
 */
public class Ex03 {
	
	public static void main(String[] args) {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		// 순차검색을 사용해서....
		int max = 920;
		// max가 있는 위치(index) 모두 출력...
		/*
		int beginIndex = 0;
		int index = sequentialSearch(m, max , beginIndex);
		System.out.println("찾은 위치(index)  : " + index);
		
		beginIndex = index + 1;
		index = sequentialSearch(m, max , beginIndex);
		System.out.println("찾은 위치(index)  : " + index);
		
		beginIndex = index + 1;
		index = sequentialSearch(m, max , beginIndex);
		System.out.println("찾은 위치(index)  : " + index);
		*/
		int beginIndex = 0;
		int index = -1;
		// 12:05수업시작~
		boolean flag = false;
		while (  (index = sequentialSearch(m, max , beginIndex)) != -1  ) {
			flag = true;
			System.out.println("찾은 위치(index)  : " + index);
			beginIndex = index + 1;
			
		} // while
		
		if( !flag ) System.out.println("검색결과 X");
		
		/* [2]
		do {
			index = sequentialSearch(m, max , beginIndex);
		} while (index != -1);
		*/
		/* [1]
		int index = sequentialSearch(m, max , beginIndex);
		
		while (index != -1) {
			index = sequentialSearch(m, max , beginIndex);
			if( index != -1)
				System.out.println("찾은 위치(index)  : " + index);
		} // while
		*/
		
		
		
		/*
		ArrayList list = new ArrayList(); 
		for (int i = 0; i < m.length; i++) {
			if( m[i] == max ) {
				// System.out.println(i);
				list.add(i);
			}
		} // for
		System.out.println( list );
		*/
		 
		
	} // main
	
	private static int sequentialSearch(int[] m, int n, int beginIndex) {
		int index = -1;
		for (int i = beginIndex; i < m.length; i++) {
			if( n == m[i] ) {
				index = i;
				break;
			}
		} // for
		
		return index;
	}
	
	private static int sequentialSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				index = i;
				break;
			}
		} // for
		
		return index;
	}

} // class







