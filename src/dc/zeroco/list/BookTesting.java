package dc.zeroco.list;

import java.util.ArrayList;
import java.util.List;

import de.zeroco.files.FilesUtility;

public class BookTesting {

	public static void main(String[] args) {
		
		//creating list 	
		List<Book> list = new ArrayList<Book>();
		
		Book bookOne = new Book(401, "java", "Harinath", "harinath publications", 3);
		Book bookTwo = new Book(402, "python", "rajesh", "rajesh publications", 5);
		Book bookThree = new Book(403, "web technology", "siva", "Mc Graw Hill" , 7);
		
		list.add(bookOne);
		list.add(bookTwo);
		list.add(bookThree);
		System.out.println(list);
		System.out.println();
		for (Book book : list) {
			System.out.println(book);
			System.out.println(FilesUtility.fileAppend("G:\\book.csv", book.toString()));
		}
	}
}
