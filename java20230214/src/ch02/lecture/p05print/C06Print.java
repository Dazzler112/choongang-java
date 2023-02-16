package ch02.lecture.p05print;

import java.util.Scanner;
//백준 3003번
public class C06Print {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int q =	scanner.nextInt();
		int r =	scanner.nextInt();
		int b =	scanner.nextInt();
		int n =	scanner.nextInt();
		int p = scanner.nextInt();
		
		System.out.printf("%d, %d, %d, %d, %d, %d",k,q,r,b,n,p);
	}
}
