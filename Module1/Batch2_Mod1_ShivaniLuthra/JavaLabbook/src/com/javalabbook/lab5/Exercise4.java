package com.javalabbook.lab5;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter employee first name: ");
		String fname= s.next();
		System.out.println("Enter employee last name");
		String lname= s.next();
		try {
			if(fname==null || lname==null) {
				throw new BlankNameException("First or last name is blank");
			}
			else
				System.out.println("First name: "+fname+ " Last name:"+lname);
		} catch(BlankNameException e) {
			System.out.println("First or last name is blank");
		}
	}
}
