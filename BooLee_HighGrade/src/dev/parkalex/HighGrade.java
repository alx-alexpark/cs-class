package dev.parkalex;

import java.util.Scanner;

public class HighGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(HighGrade.class.getResourceAsStream("highgrade.txt"));
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] values = sc.nextLine().split(" ");
			int highest = Integer.parseInt(values[0]);
			for (String s : values) {
				if (Integer.parseInt(s) > highest) {
					highest = Integer.parseInt(s);
				}
			}
			System.out.println("The highest grade is: " + highest);
			
		}
	}
}
