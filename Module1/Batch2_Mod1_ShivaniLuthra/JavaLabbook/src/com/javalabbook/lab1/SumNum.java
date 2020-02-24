package com.javalabbook.lab1;
import java.util.*;

public class SumNum {
	int sum=0;
	public int calculateSum(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumNum s = new SumNum();
		int sum1=s.calculateSum(10);
		System.out.print("Sum of first 10 natural numbers divisible by 3 and 5: "+sum1);
	}

}
