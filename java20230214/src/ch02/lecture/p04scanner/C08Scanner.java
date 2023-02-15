package ch02.lecture.p04scanner;

import java.util.Scanner;
//백준 10950 https://www.acmicpc.net/problem/10950
public class C08Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int loop = scanner.nextInt();
		for(int i = 0; i < loop;i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			System.out.println(num1 + num2);
		}
		
	}
}
