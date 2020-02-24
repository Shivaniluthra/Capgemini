package com.javalabbook.lab1;
import java.util.*;
import java.lang.*;

public class PowOfTwo {
	public boolean checkNumber(int n) {
		double sqrt=Math.sqrt(n);
		if(sqrt%2==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=s.nextInt();
		PowOfTwo i=new PowOfTwo();
		System.out.println("Is number a power of two: "+i.checkNumber(n));
	}

}
