package de.zeroco.set;

import java.util.Set;
import java.util.TreeSet;

public class BookTesting {

	public static void main(String[] args) {
		
		Set<Book> set = new TreeSet<Book>();
		set.add(new Book(4051, "java", "harinath", 600, 3));
		set.add(new Book(3095, "C++", "sivaji", 460, 5));
		set.add(new Book(5025, "python", "kesava", 200, 2));
		for (Book book : set) {
			System.out.println(book.toString());
		}
	}
}
