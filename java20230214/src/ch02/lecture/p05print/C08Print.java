package ch02.lecture.p05print;

import java.util.Scanner;

//백준 11021
public class C08Print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for(int i = 1; i <= loop;i++) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("Case #%2$d: %1$d%n",(a+b), i);
//		System.out.println("Case #" + i + ":" + (a + b)); 연결연산자 방법
		}
	}
}
