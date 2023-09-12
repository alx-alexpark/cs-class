package dev.parkalex;

public class Word implements Comparable<Word> {
	private String word;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Word() {
		word = "";
	}
	public Word(String x) {
		word = x;
	}
	public int getLength() {
		return this.word.length();
	}
	public int compareTo(Word other) {
		if (this.word.length() > other.getLength()) {
			return 1;
		} else if (other.getLength() > this.word.length()) {
			return -1;
		} else if (other.getLength() == this.word.length()) {
			return other.getWord().compareTo(this.word) > 0 ? -1 : 1;
		}
		return -1;
	}
	public String toString() {
		return this.word;
	}

}
