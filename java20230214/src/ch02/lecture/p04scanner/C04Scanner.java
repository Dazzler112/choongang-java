package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50";
		Scanner scanner = new Scanner(input);
		
		//3 ,33 ,555,50 하나 하나 읽고싶다 그럼 다음같이
		int num1 = scanner.nextInt();
		System.out.println(num1);
		scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(num2);
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println(num3 + num4);
		
	}
}
