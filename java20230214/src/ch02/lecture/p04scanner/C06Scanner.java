package ch02.lecture.p04scanner;

import java.util.Scanner;

//백준 2525번문제
public class C06Scanner {
	public static void main(String[] args) {
		String input ="""
				14 30
				20""";
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in); 제출할때 이걸로
		
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2);
		
		int currentHour = line1Scanner.nextInt();
		int currentMin = line1Scanner.nextInt();
		
		int pastMin = line2Scanner.nextInt();
		
		currentHour = (currentHour + (currentMin + pastMin) / 60) %24; //integer끼리 연산은 integer여서 소숫점은 나오지 않음
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour + " " +  currentMin);
		
	}
	
}
