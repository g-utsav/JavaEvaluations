package Unit4.W4.Qusetion2;

import java.util.List;
import java.util.Scanner;

public class Maiin {
	
	static void addBook(Library l, Scanner sc) {
		
		Book b = new Book();
		System.out.println("Enter the isbn no:");
		b.setIsbn(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Enter the book name:");
		b.setBookName(sc.nextLine());
		
		System.out.println("Enter the author name:");
		b.setAuthor(sc.nextLine());
		
		l.addBook(b);		
	}
	
	static void displayAll(Library l) {
		List<Book> all = l.viewAllBooks();
		
		for(Book b : all) {
			System.out.println("ISBN no: "+b.getIsbn());
			System.out.println("Author Name : "+b.getAuthor());
			System.out.println("Book Name : "+b.getBookName());
			System.out.println("**********************************************");
		}
		
	}
	
	static void searchBook(Library l, Scanner sc) {
		System.out.println("Enter the author name: ");
		sc.nextLine();
		String author = sc.nextLine();
		
		List<Book> all = l.viewBooksByAuthor(author);
		if(all == null || all.size() == 0) {
			System.out.println("None of the book published by the author "+author);
		}else {
			for(Book b : all) {
				System.out.println("ISBN no: "+b.getIsbn());
				System.out.println("Author Name : "+b.getAuthor());
				System.out.println("Book Name : "+b.getBookName());
				System.out.println("**********************************************");
			}
		}
	}
	
	static void countBooks(Library l, Scanner sc) {
		System.out.println("Enter the Book Name to cont : ");
		String bookName = sc.nextLine();
		System.out.println("The Number of Books found is : "+l.countNoOfBook(bookName));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();

		while(true) {
		
			System.out.println("1.Add Book");
			System.out.println("2.Display all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Count number of books - by book name");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice : ");
			int num = sc.nextInt();
			
			if(num == 1) {
				addBook(lib, sc);
			}else if(num == 2) {
				displayAll(lib);
			}else if(num == 3) {
				searchBook(lib, sc);
			}else if(num == 4) {
				countBooks(lib, sc);
			}else {
				System.out.println("Thank You");
				break;
			}
		}
		

	}

}
