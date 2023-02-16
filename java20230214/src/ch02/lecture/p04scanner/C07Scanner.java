package ch02.lecture.p04scanner;

import java.util.Scanner;

//백준 2525 토큰 사용방법
public class C07Scanner {
	public static void main(String[] args) {
		String input = """
				23 40
				25""";
		Scanner scanner = new Scanner(input);
		
		int currentHour = scanner.nextInt();
		int currentMin = scanner.nextInt();
		int pastMin = scanner.nextInt();
		
		currentHour = (currentHour + (currentHour + currentMin)/60) % 24;
		currentMin = (currentMin + pastMin) % 60;
		
		System.out.println(currentHour +" "+ currentMin);
	}
}
