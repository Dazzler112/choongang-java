package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C05Scanner {
	//백준 1000번 https://www.acmicpc.net/problem/1000
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		//코드 작성
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int res = num1 + num2;
		
		System.out.println(res);
	}
}
