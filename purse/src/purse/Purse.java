package purse;

public class Purse {
	private int numQuarters, numDimes, numNickels;

//default constructor
	public Purse() {
		this.numQuarters = 0;
		this.numDimes = 0;
		this.numNickels = 0;
//code here
	}

	public Purse(int q, int d, int n) {
		this.numQuarters = q;
		this.numDimes = d;
		this.numNickels = n;
//code here
	}

//accessor methods
	public int getQuarters() {
		return this.numQuarters;
//code here
	}

	public int getDimes() {
		return this.numDimes;
//code here
	}

	public int getNickels() {
// code here
		return this.numNickels;
	}

//modifiers or mutators
	public void setQuarters(int q) {
		this.numQuarters = q;
//code here
	}

	public void setDimes(int d) {
		this.numDimes = d;
//code here
	}

	public void setNickels(int n) {
		this.numNickels = n;
//code here
	}

//increment the number of quarters by a certain amount
	public void addQuarters(int amount) {
		this.numQuarters += amount;
//code here
	}

//increment the number of dimes by a certain amount
	public void addDimes(int amount) {
		this.numDimes += amount;
//code here
	}

//increment the number of nickels by a certain amount
	public void addNickels(int amount) {
		this.numNickels += amount;
//code here
	}

// return the total number of coins in the purse
	public int totalCoins() {
		return this.numDimes + this.numNickels + this.numQuarters;
//code here
	}

//return the amount of money in the purse
	public double valueCoins() {
		return (this.numDimes * 0.1) + (this.numNickels * 0.05) + (this.numQuarters * 0.25);
//code here
	}

// as specified in the instructions
	public String toString() {
		return String.format("Quarters: %d, Dimes: %d, Nickels: %d", this.numQuarters, this.numDimes, this.numNickels);
//code here
	}
}