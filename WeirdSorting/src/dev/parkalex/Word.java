package dev.parkalex;

public class Word implements Comparable<Word>{
	private String word;

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public int compareTo(Word other) {
		if (other.getWord().substring(1, 2).equals(this.word.substring(1, 2))) {
			return this.word.substring(3, 4).compareTo(other.word.substring(3, 4));
		} else {
			return this.word.substring(1, 2).compareTo(other.getWord().substring(1, 2));
		}
	}

	public String toString() {
		return this.word;
	}
}
