package com.javalabbook.lab4;

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		number=sc.nextInt();
		Exercise1 e= new Exercise1();
		int sum=e.sum(number);
		System.out.println("Sum of cubes of digits: "+sum);
	}
	
	public int sum(int n) {
		int sum=0, num=n, count=0, n1=0;
		while(num!=0) {
			n1=num%10;
			sum=(int) (sum + Math.pow(n1,3));
			num=num/10;
		}
		return sum;
	}

}
