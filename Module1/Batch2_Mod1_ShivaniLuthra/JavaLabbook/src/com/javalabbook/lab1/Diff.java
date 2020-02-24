package com.javalabbook.lab1;
import java.util.*;

public class Diff {
	public int calculateDifference(int n) {
		int dif, sum=0, sum_of_sq=0, sq, sq_of_sum ;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			sq=i*i;
			sum_of_sq = sum_of_sq + sq;
		}
		sq_of_sum= sum* sum;
		System.out.println("Sum of squares: "+sum_of_sq);
		System.out.println("Square of sum: " +sq_of_sum);
		return sq_of_sum-sum_of_sq;
	}
	
	public static void main(String[] args) {
		Scanner i= new Scanner(System.in);
		System.out.println("Enter number:");
		int n=i.nextInt();
		Diff d=new Diff();
		System.out.println("Difference: "+d.calculateDifference(n));
	}

}
