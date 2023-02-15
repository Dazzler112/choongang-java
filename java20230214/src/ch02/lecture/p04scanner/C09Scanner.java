package ch02.lecture.p04scanner;

import java.util.Scanner;

//백준 25304
public class C09Scanner {
	public static void main(String[] args) {
		String input ="""
				250000
				4
				20000 5
				30000 2
				10000 6
				5000 8
				""";
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in); //제출시
		
		int total = scanner.nextInt(); //총금액
		int loop = scanner.nextInt(); //몇개 샀는가
		for(int i = 0; i < loop; i++){
			int price = scanner.nextInt();
			int qty = scanner.nextInt();
			
			total -= (price * qty);
		}
		if(total == 0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
