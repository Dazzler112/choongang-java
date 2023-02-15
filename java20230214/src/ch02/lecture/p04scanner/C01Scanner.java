package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		//Scanner로 키보드로 입력받은 내용을 프로그램으로 가죠올 수 잇다.
		
		//string도 가능
		
		String input1 = """
				동해물과 백두산이
				마르고 닳도록
				하느님이 보우하사 
				우리나라 만세""";
		
		Scanner scanner = new Scanner(input1);
		// ctrl + shift +o :자동 import 단축키 //눌러야 scanner 오류 사라짐
		
		String line1 = scanner.nextLine();
		System.out.println(line1);
		System.out.println(scanner.nextLine());//2번째줄로 넘어감
		System.out.println(scanner.nextLine());//3번째 줄로 넘어감
		System.out.println(scanner.nextLine());//4번째줄
		//System.out.println(scanner.nextLine()); //더이상 읽을 줄 찾을수 없다 에러나옴
	}
}
