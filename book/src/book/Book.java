package book;

public class Book {
	private String title;
	private String author;
	private double price;
	
	public Book (String t, String a, double p) {
		title = t;
		author = a;
		price = p;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public String toString() {
		return this.title + " by " + this.author + " - " + this.price;
	}
	

}
