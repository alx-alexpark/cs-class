package dev.parkalex;

import java.util.Scanner;

public class PassFail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(PassFail.class.getResourceAsStream("passfail.txt"));
		sc.nextLine();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			int grade = Integer.parseInt(line.split(" ")[1]);
			if (grade < 70) {
				System.out.println(line.split(" ")[0]);
			}
		}
	}
	

}
