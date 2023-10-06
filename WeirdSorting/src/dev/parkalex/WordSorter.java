package dev.parkalex;

import java.util.Arrays;
import java.util.Scanner;

public class WordSorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(WordSorter.class.getResourceAsStream("words.txt"));
		int num = sc.nextInt();
		sc.nextLine();
		Word[] words = new Word[num];
		for(int i = 0;i<num;i++) {
			words[i] = new Word(sc.nextLine());
		}
		Arrays.sort(words);
		for (Word w: words) {
			System.out.println(w);
		}
	}
}
