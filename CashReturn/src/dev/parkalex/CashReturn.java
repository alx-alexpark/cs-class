package dev.parkalex;

import java.util.Scanner;

public class CashReturn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(CashReturn.class.getResourceAsStream("cashreturn.txt"));
		sc.nextLine();
		while (sc.hasNextDouble()) {
			double money = sc.nextDouble();
			double diff = Math.ceil(money) - money;
			int q = 0;
			int d = 0;
			int n = 0;
			int p = 0;
			while (diff >= 0.25) {
				diff -= 0.25;
				q++;
			}
			while (diff >= 0.1) {
				diff -= 0.1;
				d++;
			}
			while (diff >= 0.05) {
				diff -= 0.05;
				n++;
			}
			while (diff >= 0.01) {
				diff -= 0.01;
				p++;
			}
			System.out.printf("Q: %d, D: %d, N: %d, P: %d\n", q, d, n, p);
			
		}
	}
}
