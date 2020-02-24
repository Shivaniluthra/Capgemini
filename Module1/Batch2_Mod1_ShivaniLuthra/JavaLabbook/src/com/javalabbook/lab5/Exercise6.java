package com.javalabbook.lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise6 {
	public static void main(String[] args) {
		int sal;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter salary: ");
		sal= s.nextInt();
		try {
		if(sal<3000) {
				throw new EmployeeException("Salary is less than 3000");
			}
		else {
			System.out.println("Salary= "+sal);
			}
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println("Salary is less than 3000");
		}
	}

}
