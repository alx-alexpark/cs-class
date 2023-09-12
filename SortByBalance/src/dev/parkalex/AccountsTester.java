package dev.parkalex;

import java.util.Arrays;
import java.util.Scanner;

public class AccountsTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(AccountsTester.class.getResourceAsStream("accounts.txt"));
		int num = sc.nextInt();
		sc.nextLine();
		Account[] words = new Account[num];
		for(int i = 0;i<num;i++) {
			String line = sc.nextLine();
//			System.out.println(line.split(" ").length);
			words[i] = new Account(line.split(" ")[0] + " " + line.split(" ")[1], Double.parseDouble(line.split(" ")[2]));
		}
		Arrays.sort(words);
		for (Account w: words) {
			System.out.println(w);
		}
	}
	
}
