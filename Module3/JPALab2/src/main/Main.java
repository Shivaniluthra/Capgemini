package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import bean.Author;
import bean.Book;
import config.MyFactory;
import dao.DaoImpl;

public class Main {
	public static void main(String[] args) {
//		EntityManager em = MyFactory.getEntityManager();
//		EntityTransaction tx= em.getTransaction();
//		tx.begin();
//		Author a= new Author(1001,"J.K.Rowling");
//		Book b= new Book("Harry Potter and Soccerer's Stone",250.00);
//		a.getBooks().add(b);
//		a.getBooks().add(new Book("Harry Potter and Goblet Of Fire",534.11));
//		a.getBooks().add(new Book("Harry Potter and Prisoner Of Azkaban",1426.92));
//		em.persist(a);
//		Author a1= new Author(1002, "Chetan Bhagat");
//		a1.getBooks().add(new Book("Three Mistakes Of My Life",651.39));
//		a1.getBooks().add(new Book("One Night At Call Center",2861.21));
//		em.persist(a1);
//		Author a2= new Author(1003,"Nicholas Spark");
//		a2.getBooks().add(new Book("See Me",879.99));
//		a2.getBooks().add(new Book("The Notebook",4232.23));
//		em.persist(a2);
//		tx.commit();
//		System.out.println("inserted");
		
		DaoImpl dao= new DaoImpl();
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("1. Get all books");
			System.out.println("2. Get books by author name");
			System.out.println("3. Get books within price range");
			System.out.println("4. Get Author name by Book id");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			int choice  =sc.nextInt();
			
			switch(choice) {
			case 1: 
				List<Book> li= dao.displayAllBooks();
				if(li.contains(null)) {
					System.out.println("No data");
				}
				System.out.println("ID \t Title \t\t\t\t\t Price");
				for(Book b:li) {
					System.out.println(+b.getISBN()+"\t"+b.getTitle()+"\t\t"+b.getPrice());
				}
				System.out.println();
				break;
				
			case 2:
				System.out.println("Enter name of author:");
				String name= sc.next();
				List<Book> lis= dao.getBooksByAuthorName(name);
				if(lis.contains(null)) {
					System.out.println("No data");
				}
				System.out.println("ID \t Title \t\t\t\t Price");
				for(Book b:lis) {
					System.out.println(+b.getISBN()+"\t"+b.getTitle()+"\t\t"+b.getPrice());
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("Enter low and high price");
				double low= sc.nextDouble();
				double high= sc.nextDouble();
				List<Book> list= dao.bookWithinPrice(low, high);
				if(list.contains(null)) {
					System.out.println("No data");
				}
				System.out.println("ID \t Title \t\t\t\t Price");
				for(Book b:list) {
					System.out.println(+b.getISBN()+"\t"+b.getTitle()+"\t\t"+b.getPrice());
				}
				System.out.println();
				break;
				
			case 4:
				System.out.println("Enter book id:");
				int id= sc.nextInt();
				String n= dao.authorNameByBookId(id);
				System.out.println("Author name= "+n);
				System.out.println();
				break;
				
			case 5:
				System.out.println("Exitted..");
				System.exit(0);
				
			default:
				System.out.println("Enter valid option");
				System.out.println();
				break;
			}
		}while(true);
		
	}

}
