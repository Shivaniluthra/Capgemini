package com.javalabbook.lab3;

import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] strArray= {"C","A","p","g","E","m","i","N","I"};
		
		Exercise2 e= new Exercise2();
		String[] str=e.csort(strArray);
		System.out.println("Sorted String is: ");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println();
		System.out.println("Changing left part to Uppercase and right to lower:");
		e.strSplit(strArray);
	}
	public String[] csort(String[] ca) {
		Arrays.sort(ca, Collator.getInstance());
		return ca;
	}
	public void strSplit(String[] st) {
		int length= st.length;
		int l1,l2;
		if(length%2!=0) {
			l1=(length/2)+1;
		}
		else {
			l1=length/2;
		}
		
		for(int i=0;i<l1;i++) {
			System.out.print(st[i].toUpperCase()+" ");
		}
		for(int i=l1;i<length;i++) {
			System.out.print(st[i].toLowerCase()+" ");
		}
	//	System.out.print(s);
//		.toUpperCase()	+" "+st.toString().substring(l1, l2).toLowerCase()
	}

}
