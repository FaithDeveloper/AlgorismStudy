package hacker_rank;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

class MyBook extends Book {
	int price;
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		System.out.println(String.format("Title: %s\n" + 
				"Author: %s\n" + 
				"Price: %d", this.title, this.author, this.price));
	}        
}

public class HackerRankDay13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String title = scanner.nextLine();
	    String author = scanner.nextLine();
	    int price = scanner.nextInt();
	    scanner.close();
	
	    Book book = new MyBook(title, author, price);
	    book.display();
	}
}
