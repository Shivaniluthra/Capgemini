package com.javalabbook.lab3;

import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter element "+(i+1)+" :");
			int a=sc.nextInt();
			array[i]=a;
		}
		Exercise1 e= new Exercise1();
		int secsmall=e.getSecondSmallest(array);
		System.out.println("Second smallest element: "+secsmall);
	}
	
	public int getSecondSmallest(int[] array){
		Arrays.sort(array);
		return array[1];
	}

}
