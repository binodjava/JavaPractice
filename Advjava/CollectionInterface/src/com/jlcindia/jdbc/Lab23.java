package com.jlcindia.jdbc;

import java.util.List;

public class Lab23 {

	public static void main(String[] args) {
		BookService bs = new BookService();

		// Verify user
		boolean valid = bs.verifyUser("sri", "jlcindia");
		if (valid)
			System.out.println("Login sucess ! Redirecting to home page...");
		else
			System.out.println("Login Failed ! Try again");

		// Adding the Book
		Book b = new Book("Java", "Srinivas", "JLC", 250, 4);
		boolean res = bs.addBook(b);
		if (res)
			System.out.println("Book added successfully");
		else
			System.out.println("Error while adding book info");

		
		/*// Update book
		Book bk = new Book("JDBC", "Dande", "SD", 250, 5);
		bk.setBid("B-02");
		int a = bs.updateBook(bk);
		System.out.println("Book Updated :" + a);

		// Delete book
		int c = bs.deleteBook("B-01");
		System.out.println("Book Deleted :" + c);

		// Accessing Book By BID
		System.out.println("**Book by BID");
		Book bo = bs.getBookByBid("B-01");
		System.out.println(bo);

		// Accessing Book by Bname
		System.out.println("**Book by bname");
		List<Book> list = bs.getBookByBname("Java");
		for (Book b1 : list) {
			System.out.println(b1);
		}

		// Accessing Book by Author
		System.out.println("**Book By Author");
		List<Book> list1 = bs.getBookByAuthor("Srinivas");
		for (Book b1 : list1) {
			System.out.println(b1);
		}

		// Accessing Book by Cost
		System.out.println("**Book By Cost");
		List<Book> list2 = bs.getBookByCost(250);
		for (Book b1 : list2) {
			System.out.println(b1);
		}

		// Accessing ALL Books
		System.out.println("**All Books");
		List<Book> list3 = bs.getAllBooks("** All Books");
		for (Book b1 : list3) {
			System.out.println(b1);
		}*/

	}
}
