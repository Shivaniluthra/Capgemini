package com.javalabbook.lab5;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age: ");
		age= s.nextInt();
		try {
		if(age<=15) {
				throw new LessAgeException("Age is less than 15");
			}
		else {
			System.out.println("Age= "+age);
			}
		} catch (LessAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Age is less than 15");
		}
	}

}
