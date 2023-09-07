package dev.parkalex;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(Armstrong.class.getResourceAsStream("armstrong.txt"));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			int num = Integer.parseInt(line);
			int total = 0;
			for (char c : line.toCharArray()) {
				int digit = Integer.parseInt(Character.toString(c));
//				System.out.println("Digit: " + digit);
				total += Math.pow(digit, line.length());
			}
//			System.out.println(num + " : " + total);
			System.out.println(total == num ? "Armstrong" : "Not Armstrong");
		}
	}
}
