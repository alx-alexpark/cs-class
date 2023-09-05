package dev.parkalex;

import java.util.Scanner;

public class BooLee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(BooLee.class.getResourceAsStream("boolee.txt"));
		sc.nextLine();
		while (sc.hasNextLine()) {
			String[] segments = sc.nextLine().split(" ");
			if (segments[0].startsWith("ADD")) {
				double sum = 0;
				segments[0] = null;
				for (String s : segments) {
					if (s == null)
						continue;
					sum += Double.parseDouble(s);
				}
				System.out.println("ADD " + sum);
			} else if (segments[0].startsWith("SUB")) {
				double dif = Double.parseDouble(segments[1]);
				for (int i=2;i<segments.length;i++) {
					dif -= Double.parseDouble(segments[i]);
				}
				System.out.println("SUB " + dif);
			} else if (segments[0].startsWith("MUL")) {
				double prod = 1;
				segments[0] = null;
				for (String s : segments) {
					if (s == null)
						continue;
					prod *= Double.parseDouble(s);
				}
				System.out.println("MUL " + prod);
			} else if (segments[0].startsWith("DIV")) {
				double div = Double.parseDouble(segments[1]);
				segments[0] = null;
				for (int i=2;i<segments.length;i++) {
					div /= Double.parseDouble(segments[i]);
				}
				System.out.println("DIV " + div);
			}
		}
		
	}
}
