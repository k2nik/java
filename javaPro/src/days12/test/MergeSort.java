package days12.test;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// 이미 정렬되어져 있는 두 배열을 합하여 한 개 배열로 만드는 정렬
		int [] m = {1,4,5,8,10};
		int [] n = {2,3,6,7};

		int [] mn = new int[m.length+n.length];
		int mIndex = 0;
		int nIndex = 0;
		int mnIndex = 0;

		do {
			if (m[mIndex] > n[nIndex]) {
				mn[mnIndex++] = n[nIndex++];
			}else {
				mn[mnIndex++] = m[mIndex++];
			}
		} while (mIndex != m.length && nIndex != n.length );

		int remainIndex = (mIndex == m.length? nIndex: mIndex );
		int [] remainArr = (mIndex == m.length? n: m );
		for (int i = remainIndex; i < remainArr.length; i++) {
			mn[mnIndex++] = remainArr[i];
		} // for

		System.out.println( Arrays.toString(mn));


	} // main

}
