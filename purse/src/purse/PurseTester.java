package purse;

public class PurseTester {
//returns the highest number of coins in any purse
	public static int highCoinsPurse(Purse[] arr) {
		int max = arr[0].totalCoins();
		for (Purse p : arr) {
			if (p.totalCoins() > max) {
				max = p.totalCoins();
			}
		}
		return max;

	}

//returns the total amount of money in all purses combined
	public static double valueAllPurses(Purse[] arr) {
		double total = 0;
		for (Purse p: arr) {
			total += p.valueCoins();
		}
		return total;

	}

//returns the total number of coins in all purses combined
	public static int sumCoinsAllPurses(Purse[] arr) {
		int total = 0;
		for (Purse p : arr) {
			total += p.totalCoins();
		}
		return total;

	}

	public static void addFourQuarterstoAll(Purse[] arr) {
		for (Purse p : arr) {
			p.addQuarters(4);
		}

	}

	public static void emptyAllPurses(Purse[] arr) {
		for (Purse p : arr) {
			p.setDimes(0);
			p.setNickels(0);
			p.setQuarters(0);
		}
	}

	public static void main(String[] args) {
//create 4 Purse objects with information of your choice

//create a Purse array and store the Purse objects

// call the methods in the PurseTester
		Purse[] purses = new Purse[4];
		purses[0] = new Purse(1, 2, 3);
		purses[1] = new Purse(4, 5, 6);
		purses[2] = new Purse(7, 8, 9);
		purses[3] = new Purse(10, 11, 12);
		
		for (Purse p : purses) {
			System.out.println(p.toString());
		}
		System.out.println(highCoinsPurse(purses));
		System.out.println(valueAllPurses(purses));
		System.out.println(sumCoinsAllPurses(purses));
		addFourQuarterstoAll(purses);
		for (Purse p : purses) {
			System.out.println(p.toString());
		}
		emptyAllPurses(purses);
		for (Purse p : purses) {
			System.out.println(p.toString());
		}
		
	}
}
