package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2023. 7. 18. - 오전 6:56:11
 * @subject 복습 후 제어문 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		 String name;
		 int kor, eng, mat, total;
		 double avg;
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("> name,kor,eng,mat? "); // 홍길동 89 78 90
		 String input = br.readLine();
		 // 구분자 :  콤마(,) , 공백( )
		 //String regex = "\\s*,\\s*";
		 String regex = "[, ]";
		 String[] datas = input.split(regex);
		 
		 name = datas[0];
		 // java.lang.NumberFormatException: For input string: " 90   "
		 kor = Integer.parseInt(datas[1]); //  " 90   " -> 앞뒤 공백 제거
		 eng = Integer.parseInt(datas[2]);
		 mat = Integer.parseInt(datas[3]);

		 total = kor+eng+mat;
		 avg =(double)total/3;
		 System.out.printf("이름=\"%s\",국어=%d,영어=%d,수학=%d,총점=%d,평균=%.2f",
				 name,kor,eng,mat,total,avg);

		
	}// main

}// class






 