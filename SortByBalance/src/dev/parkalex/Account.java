package dev.parkalex;

public class Account implements Comparable<Account>{
	private String name;
	private double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public int compareTo(Account other) {
		if (this.balance > other.getBalance()) {
			return 1;
		} else if (other.getBalance() > this.balance) {
			return -1;
		} else {
			return this.name.split(" ")[1].compareTo(other.getName().split(" ")[1]);
		}
	}
	public String toString() {
		return this.name.split(" ")[0] + "\t" + this.name.split(" ")[1] + "\t" + this.balance;
	}
}
