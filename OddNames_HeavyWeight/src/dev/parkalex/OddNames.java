package dev.parkalex;

import java.util.*;

public class OddNames {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(OddNames.class.getResourceAsStream("oddnames.txt"));
		int odds = 0;
		int numLines = sc.nextInt();
		for (int i = 0;i<numLines;i++) {
			if (sc.nextLine().length() % 2 == 1) {
				odds++;
			}
		}
		System.out.println("The number of odd names is: " + odds);
	}
}
