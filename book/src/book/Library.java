package book;

public class Library {
	public static void main(String[] args) {
		Book[] books = new Book[10];
		
		books[0] = new Book("A tale of two cities", "Charles Dicken", 35.0);
		books[1] = new Book("Harry Potter", "J.K. Rowling", 30.0);
		books[2] = new Book("Talking to strangers", "Malcomn Gladwell", 42.0);
		books[3] = new Book("Three women", "Lisa Taddeo", 17.0);
		books[4] = new Book("Catch and kill", "Ronan Farrow", 25.0);
	}
	
	public static int booksMoreExpensiveThan(Book[] books, double limit) {
		int count = 0;
		for (Book b : books) {
			if (b.getPrice() > limit) {
				count++;
			}
		}
		return count;
	}
	
	public static String getMostExpensiveBookTitle(Book[] books) {
		double currentMax = books[0].getPrice();
		String currentMaxTitle = books[0].getTitle();
		for (Book b : books) {
			if (b.getPrice() > currentMax) {
				currentMax = b.getPrice();
				currentMaxTitle = b.getTitle();
			}
		}
		return currentMaxTitle;
	}
	
	public static String getAuthorOfBookByTitle(Book[] books, String bookTitle) {
		for (Book b : books) {
			if (b.getTitle() == bookTitle) {
				return b.getAuthor();
			}
		}
		return null;
	}
	
	public static double getAverageBookPrice(Book[] books) {
		double sum = 0;
		for (Book b : books) {
			sum += b.getPrice();
		}
		return sum/books.length;
	}
	
	public static String bookStartsWith(Book[] books, String startsWithText) {
		String infostring = "";
		for (Book b : books) {
			if (b.getTitle().startsWith(startsWithText)) {
				infostring += b.toString() + "\n";
			}
		}
		return infostring;
	}
	
	public static String storeBook(Book[] books, Book newBook) {
		for (int i=0;i<books.length;i++) {
			if (books[i] == null) {
				books[i] = newBook;
				return "Sucessfully placed book in index " + i;
			}
		}
		return "Your book could not be stored due to not being enough space";
	}
}
