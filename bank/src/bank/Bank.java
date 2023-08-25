package bank;

public class Bank {
	public static void main(String[] args) {
		Account[] accounts = new Account[5];
		accounts[0] = new Account("A", "A1", 2.0);
		accounts[1] = new Account("B", "A2", 29.0);
		accounts[2] = new Account("C", "A3", 3000.0);
		accounts[3] = new Account("D", "A4", 5000);
		accounts[4] = new Account("E", "A5", 15.0);
		
		accounts[0].deposit(550);
		accounts[1].deposit(740);
		accounts[2].withdraw(400);
		accounts[3].withdraw(350);
		
		for (Account a: accounts) {
			System.out.println(a.toString());
		}
		
		System.out.println(mostValueableAccountBalance(accounts));
		System.out.println(richestPerson(accounts));
		System.out.println(numAccountsWithMoreThan1500Dollars(accounts));
		System.out.println(accountWithLeastMoney(accounts));
		System.out.println(allTheMoneyTotal(accounts));
		
	}
	
	public static double mostValueableAccountBalance(Account[] accounts) {
		double max = accounts[0].getBalance();
		for (Account a : accounts) {
			if (a.getBalance() > max) {
				max = a.getBalance();
			}
		}
		return max;
	}
	
	public static String richestPerson(Account[] accounts) {
		double max = accounts[0].getBalance();
		String richestPersonName = accounts[0].getName();
		for (Account a: accounts) {
			if (a.getBalance() > max) {
				max = a.getBalance();
				richestPersonName = a.getName();
			}
		}
		return richestPersonName;	
	}
	
	public static int numAccountsWithMoreThan1500Dollars(Account[] accounts) {
		int counter = 0;
		for (Account a: accounts) {
			if (a.getBalance() > 1500) {
				counter++;
			}
		}
		return counter;
	}
	
	public static Account accountWithLeastMoney(Account[] accounts) {
		double min = accounts[0].getBalance();
		Account lowestAcc = accounts[0];
		for (Account a: accounts) {
			if (a.getBalance() < min) {
				min = a.getBalance();
				lowestAcc = a;
			}
		}
		return lowestAcc;
	}
	
	public static double allTheMoneyTotal(Account[] accounts) {
		double sum = 0;
		for (Account a: accounts) {
			sum += a.getBalance();
		}
		return sum;
	}
	
	
	
	
	
	
	
	
}
