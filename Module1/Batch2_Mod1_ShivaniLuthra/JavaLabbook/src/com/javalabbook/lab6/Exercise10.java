package com.javalabbook.lab6;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		String userName;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter username(username should end with '_job' and should have at least 8 characters before '_job'): ");
		userName= sc.next();
		System.out.println("Is username valid?: "+validation(userName));
	}
	
	public static boolean validation(String un) {
		if(un.matches("[a-zA-Z]{8,20}_job"))
			return true;
		return false;
	}

}
