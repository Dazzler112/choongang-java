package ch06.example.ex20;

import java.util.*;

public class BankApplicatiton {
	public static void main(String[] args) {
			Account[] accounts = new Account[100]; //100개의 account
			int numOfAccounts = 0; //account가 몇개 만들어 졌는지 알아야겠다
			Scanner sc = new Scanner(System.in);
			boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택>");
			
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1 -> {
				//계좌생성
				System.out.println("---------");
				System.out.println("계좌생성");
				System.out.println("---------");
				
				System.out.println("계좌번호:");
				String number = sc.next();
				System.out.println("예금주:");
				String name = sc.next();
				System.out.println("초기입금액:");
				int money = sc.nextInt();
				
				Account account = new Account();
				account.setNumber(number);
				account.setName(name);
				account.setMoney(money);
				accounts[numOfAccounts] = account;
				numOfAccounts++; //account 만들어질때 마다 +1
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2->{
				//목록 보여주기
				System.out.println("---------");
				System.out.println("계좌목록");
				System.out.println("---------");
				
				for(int i = 0; i < numOfAccounts; i++) {
					System.out.printf("%7s%10s%10s%n",accounts[i].getNumber(),accounts[i].getName(),accounts[i].getMoney()); 
				}
			
			}
			case 3->{
				System.out.println("---------");
				System.out.println("예금");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				String number = sc.next();
				
				System.out.println("예금액: ");
				int inputMoney = sc.nextInt();
				
				//입력된 계좌번호를 가진 Account 객체 찾아서
				for(int i = 0; i< numOfAccounts; i++) {
					Account cur = accounts[i];
					
					if(cur.getNumber().equals(number)) {
						//입력받은 금액을 더해서 다시 넣어준다(set)
						int money = cur.getMoney() + inputMoney;
						cur.setMoney(money);
					}
				}
			}
			case 4->{
				//출금
				System.out.println("---------");
				System.out.println("출금");
				System.out.println("---------");
				
				System.out.println("계좌번호: ");
				String number = sc.next();
				
				System.out.println("출금액: ");
				int inputMoney = sc.nextInt();
				
				//입력된 계좌번호를 가진 Account 객체 찾아서
				for(int i = 0; i< numOfAccounts; i++) {
					Account cur = accounts[i];
					
					if(cur.getNumber().equals(number)) {
						//입력받은 금액을 빼서 다시 넣어준다(set)
						int money = cur.getMoney() - inputMoney;
						cur.setMoney(money);
					}
				}
			}
			case 5->{
				//종료
				run = false;
			}
			}
		}

		System.out.println("프로그램 종료");
	}
}
