package com.javalabbook.lab6;

import java.util.Scanner;

import com.javalabbook.lab5.Exercise2;

public class Exercise5 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		Exercise5 e= new Exercise5();
		System.out.println("Difference= "+e.modifyNumber(num)); 
	}
	
	public int modifyNumber(int num) {
		String s= Integer.toString(num);
		StringBuffer sb= new StringBuffer();
		int dif=0, len=s.length();
		char u= s.charAt(len-1);
		int unit=Character.getNumericValue(u);
		for(int i=0;i<len-1;i++) {
			int a=s.charAt(i+1);
			int b=s.charAt(i);
			dif=Math.abs(a-b);
			sb.append(dif);
		}
		sb.append(unit);
		String s1=sb.toString();
		int n=Integer.parseInt(s1);
		return n;
	}

}
