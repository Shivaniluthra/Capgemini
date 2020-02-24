package com.javalabbook.lab10;

import java.util.*;

@FunctionalInterface
interface Demo{
	public double power(int x,int y);
}
public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x: ");
		int x=sc.nextInt();
		System.out.println("Enter value of y: ");
		int y=sc.nextInt();
		Demo pow= (a,b)-> Math.pow(x, y);
		Double res= pow.power(x,y);
		System.out.println("Result= "+res);
		
	}

}
