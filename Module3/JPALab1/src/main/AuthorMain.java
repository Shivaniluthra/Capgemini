package main;

import java.util.Scanner;

import bean.Author;
import dao.AuthorDao;
import exceptions.authorNotFoundException;

public class AuthorMain {
	public static void main(String[] args) throws authorNotFoundException {
		AuthorDao dao= new AuthorDao();
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("1. Create Author");
			System.out.println("2. Update phone number");
			System.out.println("3. Delete Author");
			System.out.println("4. Get Author By ID");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			int choice  =sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter id:");
				int id= sc.nextInt();
				System.out.println("Enter First name:");
				String fName= sc.next();
				System.out.println("Enter Middle name:");
				String mName= sc.next();
				System.out.println("Enter Last name:");
				String lName= sc.next();
				System.out.println("Enter phone number");
				long pNo= sc.nextLong();
				Author a= new Author(id,fName,mName,lName,pNo);
				System.out.println(dao.insertAuthor(a));
				break;
				
			case 2:
				System.out.println("Enter id:");
				int id1= sc.nextInt();
				System.out.println("Enter new phone number:");
				long pno= sc.nextLong();
				System.out.println(dao.updatePhoneNo(id1, pno));
				break;
				
			case 3:
				System.out.println("Enter id:");
				int id2= sc.nextInt();
				System.out.println(dao.deleteAuthor(id2));
				break;
				
			case 4:
				System.out.println("Enter id:");
				int id3= sc.nextInt();
				Author a1= dao.findAuthorById(id3);
				System.out.println("ID= "+a1.getAuthorId()+", Name= "+a1.getFirstName()+" "+a1.getMiddleName()+" "+a1.getLastName()+", Phone Number= "+a1.getPhoneNo());
				break;
				
			case 5: 
				System.out.println("Exitted..");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter valid option");
				break;
			}
		}while(true);
	}
}
