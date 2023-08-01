package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 31. - 오후 3:28:34
 * @subject
 * @content
 */
public class Ex11 {

	// [ 한 학생의 성적 관리 Student 클래스 선언 ]
	// days10.Ex06_04.java 1반 성적처리		
	// days12.Ex05.java    3반 성적 처리
	// [한 반에 30명 학생의 성적 처리] -> 클래스 사용 수정
	// 4:05 수업 시작~ 
	public static void main(String[] args) throws IOException {

		String name;
		int kor, eng, mat;
		int tot;
		double avg;
		int rank;

		final int STUDENT_COUNT = 30;  
		
		// 클래스 배열(기억)
		Student [] students = new Student[STUDENT_COUNT];
		// students 배열명
		// [ null ][null][null][][][]  ->   []s
		// s[0]

		Scanner scanner = new Scanner(System.in);
		int count = 0;  
		char con = 'y';

		
		int no = 1;
		do {
			System.out.printf("> 이름, 국어, 영어, 수학 입력? ");
			// scanner.next() = scanner.nextLine() 
			name = getName();  //scanner.nextLine();
			kor = getScore();
			eng = getScore();
			mat = getScore();	
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			rank = 1;

			// students[count] null
			students[count] = new Student();
			students[count].no = no++;
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;		
			students[count].rank = rank;

			count++;

			// 입력 계속 ? y 
			System.out.print("> 학생 입력 계속 ?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		// 등수처리
		
		for (int i = 0; i < count; i++) {
			students[i].printStudentInfo();
		} // for

	} // main

	public static String getName() {

		Random rnd = new Random();		
		char [] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가' +1) + '가');
		} // for

		// char[] -> String
		String name = String.valueOf(nameArr);  
		return name;
	}

	public static int getScore() {		 
		return (int)(Math.random()*101);
	}
 
	 

} // class











