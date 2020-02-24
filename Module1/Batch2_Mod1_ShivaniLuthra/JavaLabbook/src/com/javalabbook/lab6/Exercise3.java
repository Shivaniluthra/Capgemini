package com.javalabbook.lab6;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		
		String s=sc.next();
		Exercise3 e= new Exercise3();
		String str=e.getImage(s);
		System.out.println(s+"|"+str);
	}
	
	public String getImage(String s) {
		StringBuffer sb= new StringBuffer(s);
		return sb.reverse().toString();
	}
}
