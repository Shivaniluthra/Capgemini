package com.javalabbook.lab5;

import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms of fibonacci series:");
		num=sc.nextInt();
		Exercise2 e= new Exercise2();
		
		System.out.println("Fibonacci series without recursion:");
		e.fib(num);
		System.out.println();
		System.out.println();
		System.out.println("Fibonacci series with recursion:");
		for(int i=0;i<num;i++) {
			System.out.print(e.fibonacci(i)+" ");
		}
	}
	
	public void fib(int num) {
		int a=1, b=1, c=0;
		System.out.print(a+" "+b);
		for(int i=2;i<num;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	
	public int fibonacci(int num) {
		if(num==0)
			return 1;
		if(num==1)
			return 1; 
		else
			return (fibonacci(num-1)+ fibonacci(num-2));
	}

}
