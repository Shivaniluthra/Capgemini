package com.javalabbook.lab1;
import java.util.*;

public class IncNumber {
	public boolean checkNumber(int n) {
		int num=n,rem1,rem2;
		while(num!=0) {
			rem1=num%10;
			num=num/10;
			rem2=num%10;
			if(rem1>=rem2) {
				return (true);
			}
			else {
				return (false);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=s.nextInt();
		IncNumber i=new IncNumber();
		boolean b= i.checkNumber(n);
		System.out.println("Is number increasing: "+b);
	}

}
