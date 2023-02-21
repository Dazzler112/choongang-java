package ch04.exercise;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		while(run) {
			
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.println("선택 >");
			
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1" ->{
				System.out.println("예금액>");
				int money = Integer.parseInt(sc.nextLine());
				balance += money;
			}			
			case "2" ->{
				System.out.println("출금액>");
				int money = Integer.parseInt(sc.nextLine());
				balance -= money;
			}
			case "3" ->{
				System.out.println("잔고>" + balance);
			}
			case "4" ->{
				run = false;
			
			}
			}
			System.out.println("프로그램 종료");
		}
		
		
		
		
		
		
		
		
		
		
		
		
/* 내가 한거
 * 		boolean atm = true;
 *
		int inNout = 0;
		
		while(atm) {
		System.out.println("---------------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("---------------------------------------");
		System.out.println("선택 >");
		
		
		String strN = sc.nextLine();
		int inner = 0;
		int outter = 0;
		if(strN.equals("1")) {
			inner = inNout++;
			System.out.println("예금액>");
			inNout = sc.nextInt();
		}else if(strN.equals("2")) {
			inNout = sc.nextInt();
			outter =inNout--;
			System.out.println("출금액>");
		}else if(strN.equals("3")) {
			int sum = inner - outter;
			sum = sc.nextInt();
			System.out.println("잔고>");
		}else if(strN.equals("4")) {
			atm = false;
			
		}
		}

		System.out.println("프로그램 종료"); */
	}
}
