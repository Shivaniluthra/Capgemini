package com.javalabbook.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array= new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter element "+(i+1)+" :");
			array[i]=sc.nextInt();
		}
		System.out.println();
		Exercise3 e= new Exercise3();
		int[] arr= e.arrayReverse(array);
		System.out.println("Array elements after reversing:");
		e.print(arr);
		System.out.println();
		System.out.println();
		System.out.println("Array elements after sorting:");
		int[] sortArray=e.arraySort(arr);
		e.print(sortArray);
	}
	
	public int[] arrayReverse(int[] ar) {
		int rem=0,n=0,num=0;
		int[] revArray=new int[10];
		for(int i=0;i<10;i++) {
			revArray[i]=0;
			rem=0;
			while(num!=0) {
				n=num%10;
				rem=rem*10+n;
				num=num/10;
			}
			revArray[i]=rem;
		}
		return revArray;
	}
	
	public int[] arraySort(int[] array){
		Arrays.sort(array);
		return array;
	}
	
	public void print(int[] arr) {
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
	}

}
