package ch06.example.ex20;

public class AccountMy {
	 final String accountNumber;
	 String name;
	 int money;
	
	public AccountMy (String accountNumber, String name, int money){
		this.accountNumber = accountNumber;
		this.name = name;
		this.money = money; 
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
