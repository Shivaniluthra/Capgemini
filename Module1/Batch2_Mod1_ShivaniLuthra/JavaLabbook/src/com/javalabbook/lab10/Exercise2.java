package com.javalabbook.lab10;

import java.util.*;

@FunctionalInterface
interface Space{
	public void insertSpace(String s);
}

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter a String: ");
		String str= sc.next();
		Space s1= (s) -> {
			for(char i:s.toCharArray()) {
				sb.append(i).append(" ");
			}
			System.out.println(sb);	
		};
		s1.insertSpace(str);
	}

}
