package ch16.example.ch06ex20remaster;

import java.util.*;

import ch06.example.ex20.Account;

public class Ch06e20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Account> accounts = new ArrayList<>();
		boolean run = true;
		int numOfAccount = 0;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택>");
			
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:{
				System.out.println("-----------");
				System.out.println("계좌생성");
				System.out.println("-----------");
				System.out.println("계좌번호 : ");
				String number = sc.next();
				System.out.println("계좌주: ");
				String name = sc.next();
				System.out.println("초기입금액: ");
				int money = sc.nextInt();
				
				Account account = new Account();
				account.setNumber(number);
				account.setName(name);
				account.setMoney(money);
				//리스트에 추가
				accounts.add(account);
				System.out.println("결과: 계좌가 생성되었습니다.");
			}
			case 2:{
				System.out.println("-----------");
				System.out.println("계좌목록");
				System.out.println("-----------");
				for(Account account : accounts) {
					System.out.printf("%7s%10s%10s%n", accounts[i].getNumber(),accounts[i].getName(),accounts[i].getMoney());
				}
				
			}
			case 3:{
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");
				System.out.println("계좌번호: ");
				String number = sc.next();
				System.out.println("예금액: ");
				int money = sc.nextInt();
				
				for(Account account : accounts) {
					
					if(account.getNumber().equals(number)) {
						//입력받은 금액을 더해서 다시 넣어준다(set)
						int money = account.getMoney() + inputMoney;
						account.setMoney(money);
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
				for(Account account : accounts) {
					if(account.getNumber().equals(number)) {
						//입력받은 금액을 빼서 다시 넣어준다(set)
						int money = account.getMoney() - inputMoney;
						account.setMoney(money);
					}
				}
			}
			case 5:{
				run = false;
			}
			}
		}
			System.out.println("프로그램 종료");
	}
}
