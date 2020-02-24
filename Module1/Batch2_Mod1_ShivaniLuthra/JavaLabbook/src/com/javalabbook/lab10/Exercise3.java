package com.javalabbook.lab10;

import java.util.*;

interface UP{
	public boolean verify(String username, String password);
}

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String un= sc.next();
		System.out.println("Enter password: ");
		String pw= sc.next();
		
		UP u1 = (u,p)-> {
			if(u.equals("Shivani") && p.equals("Luthra"))
				return true;
			return false;
		};
		System.out.println(u1.verify(un, pw));
		
	}

}
