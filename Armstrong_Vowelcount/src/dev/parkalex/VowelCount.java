package dev.parkalex;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(VowelCount.class.getResourceAsStream("vowelcount.txt"));
		sc.nextLine();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			char[] chars = line.toCharArray();
			int vowelcount = 0;
			int consonantcount = 0;
			for (char c : chars) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelcount++;
				} else {
					consonantcount++;
				}
			}
			System.out.println(line);
			System.out.println(vowelcount > consonantcount ? 1 : 0);
			
		}
	}
}
