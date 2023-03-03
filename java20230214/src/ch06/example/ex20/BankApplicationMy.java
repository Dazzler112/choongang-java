package ch06.example.ex20;

import java.util.*;

public class BankApplicationMy {
	public static void main(String[] args) {
		AccountMy owner1 = new AccountMy("111-111", "홍길동", 10000);
		AccountMy owner2 = new AccountMy("111-222","강자바",20000);
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] Account = null;
		int plus = 0;
		int minong = 0;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");
			int menu = sc.nextInt();
			System.out.println("--------");
			switch (menu) {
			case 1 ->{
				System.out.println("계좌생성");
				System.out.println("--------");
				System.out.println("계좌번호: " +owner1.accountNumber);
				System.out.println("계좌주: " +owner1.name);
				System.out.println("초기입금액: "+owner1.money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				System.out.println("---------------------------------------------------");
				System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
				System.out.println("---------------------------------------------------");
				System.out.println("선택>1");
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				System.out.println("계좌번호: " +owner2.accountNumber);
				System.out.println("계좌주: " +owner2.name);
				System.out.println("초기입금액: "+owner2.money);
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			
			case 2->{
				System.out.println("계좌목록");
				System.out.println("--------");
				System.out.print(owner1.accountNumber+"   ");
				System.out.print(owner1.name+"   ");
				System.out.println(owner1.money +plus);
				System.out.print(owner2.accountNumber+"   ");
				System.out.print(owner2.name+"   ");
				System.out.println(owner2.money+minong);
			}
			case 3->{
				System.out.println("예금");
				System.out.println("--------");
				System.out.println("계좌번호: " +owner1.accountNumber);
				System.out.print("예금액: ");
				int money = sc.nextInt();
				plus += money;
			}
			case 4->{
				System.out.println("출금");
				System.out.println("--------");
				System.out.println("계좌번호: " +owner2.accountNumber);
				System.out.print("출금액: ");
				int money = sc.nextInt();
				if(owner2.money < money) {
					System.out.println("금액이 부족합니다");
				}else if(owner2.money > money) {
					minong -= money;
					System.out.println("결과: 출금이 성공되었습니다.");
				}
			}
			case 5 ->{
				System.out.println("프로그램 종료");
				run = false;
			}
			}
		}
	}
}
