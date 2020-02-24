package com.javalabbook.lab10;

import java.util.*;

@FunctionalInterface
interface Fact{
	public void fact(int number);
}

public class Exercise5 {
	public static void facto(int number) {
		int factorial = 1;
		for(int i=1;i<=number;i++) {
			factorial= i*factorial;
		}
		System.out.println("Factorial= "+factorial);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();

		Fact f1= Exercise5::facto;
		f1.fact(number);		//calling interface method
	}

}
