package bank;

public class Account {
	private double balance;
	private String name;
	private String accountID;
	
	public Account() {
		balance = 0;
		name = "";
		accountID = "";
	}
	
	public Account(String n, String a, double b) {
		this.balance = b;
		this.name = n;
		this.accountID = a;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdraw(double amt) {
		balance -= amt;
	}
	
	public String toString() {
		return this.name + " " + this.accountID + " " + this.balance;
	}
	

}
