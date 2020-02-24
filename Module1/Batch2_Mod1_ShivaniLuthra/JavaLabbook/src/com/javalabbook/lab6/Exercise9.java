package com.javalabbook.lab6;

import java.time.*;
import java.util.*;

public class Exercise9 {
	   public static void main(String[] args)
	    {
		   Scanner sc= new Scanner(System.in);
		   System.out.println("enter year in '1995' format:");
		   int year= sc.nextInt();
		   System.out.println("enter month in '01' format:");
		   int month= sc.nextInt();
		   System.out.println("enter date in '01' format:");
		   int date= sc.nextInt();
	        LocalDate pdate = LocalDate.of(year, month, date);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	 
	     System.out.println("Duration is "+diff.getYears()+" years, "+diff.getMonths()+" months and "+diff.getDays());
	  }
	
}
