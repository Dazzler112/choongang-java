package ch04.exercise;

import java.util.Scanner;

public class Example07Scanner {
	public static void main(String[] args) {
		String input = """
				1
				10000
				2
				
				""";
		Scanner sc = new Scanner(input);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());
		
		System.out.println("종료");
	}
}
