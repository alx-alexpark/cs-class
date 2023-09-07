package dev.parkalex;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(PerfectNumber.class.getResourceAsStream("perfectnumber.txt"));
		sc.nextLine();
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			int numsum = 0;
			for (int i=1;i<num;i++) {
				if (num % i == 0) {
					numsum += i;
				}
			}
			System.out.println(num == numsum ? num + " is a perfect number" : num + " is NOT a perfect number");
		}
	}
}
