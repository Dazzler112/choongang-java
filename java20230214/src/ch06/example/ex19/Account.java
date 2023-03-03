package ch06.example.ex19;

public class Account {//별일 없으면 private
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	private int Balance;
	

	public int getBalance() {
		return Balance;
	}


	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.Balance = balance;
		}
	}

}
