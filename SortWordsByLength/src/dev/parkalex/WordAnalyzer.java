package dev.parkalex;
import java.util.*;

public class WordAnalyzer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(WordAnalyzer.class.getResourceAsStream("words.txt"));
		int num = sc.nextInt();
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
