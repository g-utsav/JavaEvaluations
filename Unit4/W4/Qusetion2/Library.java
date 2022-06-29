package Unit4.W4.Qusetion2;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book) {
		if(bookList.add(book)) {
			System.out.println("Book added successfully");
		}else {
			System.out.println("Unsucessful in adding book");
		}
	}
	
	boolean isEmpty() {
		if(bookList.size()>0) {
			return false;
		}else {
			return true;
		}
	}
	
	List<Book> viewAllBooks(){
		return bookList;
	}
	
	List<Book> viewBooksByAuthor(String author ){
		if(isEmpty()) {
			System.out.println("The list is empty");
			return null;
		}else {
			List<Book> books = new ArrayList<>();
			
			for(Book b : bookList) {
				if(b.getAuthor().equals(author)) {
					books.add(b);
				}
			}
			
			return books;
		}
	}
	
	int countNoOfBook(String bookName) {
		int c = 0;
		
		for(Book b : bookList) {
			if(b.getBookName().equals(bookName)) {
				c++;
			}
		}
		
		return c;
	}
}
