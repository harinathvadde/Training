package de.zeroco.set;

public class Book implements Comparable<Book> {

	int id;
	String name;
	String author;
	double price;
	int quantity;
	
	public Book(int id, String name, String author, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public int compareTo(Book input) {
		if (id > input.id) {
			return 1;
		} else if(id < input.id){
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
}
