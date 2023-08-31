package dev.parkalex;

import java.util.Scanner;

public class HeavyWeight {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(HeavyWeight.class.getResourceAsStream("heavyweight.txt"));
		int limit = sc.nextInt();
		int count = 0;
		while (sc.hasNextInt()) {
			if (sc.nextInt() > limit) {
				count ++;
			}
		}
		System.out.println("The number of people whose weights exceed the limit is: " + count);
	}

}
