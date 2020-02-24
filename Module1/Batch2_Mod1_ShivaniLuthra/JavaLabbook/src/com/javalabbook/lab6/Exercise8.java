package com.javalabbook.lab6;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s= sc.next();
		System.out.println("Is entered String positive? :"+positiveString(s));
		
	}
	
	public static boolean positiveString(String s) {
		int flag=0;
		for(int i=0;i<s.length()-1;i++) {
			int a= s.charAt(i);
			int b= s.charAt(i+1);
			System.out.println(a+" "+b);
			if(a<b) {
				flag=1;
			}
			else
				flag=0;
			if(flag==0) {
				break;
			}
		}
		if(flag==1)
			return true;
		return false;
	}

}
