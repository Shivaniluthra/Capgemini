package com.jdbclabbook.lab3.main;

import java.util.Scanner;

import com.jdbclabbook.lab3.bean.Author;
import com.jdbclabbook.lab3.bean.Book;
import com.jdbclabbook.lab3.service.AuthorService;
import com.jdbclabbook.lab3.service.AuthorServiceImpl;
import com.jdbclabbook.lab3.service.BookService;
import com.jdbclabbook.lab3.service.BookServiceImpl;

public class BookAuthorMain {
	public static void main(String[] args) {
		BookService bservice= new BookServiceImpl();
		AuthorService aservice= new AuthorServiceImpl();
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("1. Add Book");
			System.out.println("2. Add Author");
			System.out.println("3. Find Book By Author name");
			System.out.println("4. Update Book price by Author Name");
			System.out.println("5. Exit");
			System.out.println("Enter choice");
			int ch= sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter book title");
				String title=sc.next();
				System.out.println("Enter price:");
				double price= sc.nextDouble();
				Book b= new Book(title, price);
				bservice.addBook(b);
				break;
				
			case 2: System.out.println("Enter Author name:");
				String name= sc.next();
				Author a= new Author(name);
				aservice.addAuthor(a);
				break;
			
			case 3: System.out.println("Enter author name:");
				String authorName= sc.next();
				bservice.bookList(authorName);
				break;
				
			case 4: System.out.println("Enter Author name");
				String authorname= sc.next();
				System.out.println("Enter new Price:");
				double p= sc.nextDouble();
				bservice.updatePrice(authorname, p);
				break;
				
			case 5:
				System.exit(0);
				
			default: System.out.println("Enter valid input.");
			}
		}while(true);
	}

}
