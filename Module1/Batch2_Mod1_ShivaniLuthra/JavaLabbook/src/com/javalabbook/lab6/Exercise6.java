package com.javalabbook.lab6;

import java.util.Scanner;

public class Exercise6 { 
	// A function that prints 
	// given number in words  
	static void convert_to_words(char[] num) 
	{ 
	    // Get number of digits 
	    // in given number 
	    int len = num.length;  
	  
	    // Base cases  
	    if (len == 0)  
	    { 
	        System.out.println("empty string"); 
	        return; 
	    } 
	    if (len > 4)  
	    { 
	        System.out.println("Length more than 4 is not supported"); 
	        return; 
	    } 
	  
	    /* The first string is not used, it is to make  
	        array indexing simple */
	    String[] single_digits = new String[]{ "zero", "one",  
	                                        "two", "three", "four", 
	                                        "five", "six", "seven",  
	                                            "eight", "nine"}; 
	  
	    /* The first string is not used, it is to make  
	        array indexing simple */
	    String[] two_digits = new String[]{"", "ten", "eleven", "twelve",  
	                                        "thirteen", "fourteen", 
	                                        "fifteen", "sixteen", "seventeen", 
	                                        "eighteen", "nineteen"}; 
	  
	    /* The first two string are not used, they are to make array indexing simple*/
	    String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",  
	                                            "fifty","sixty", "seventy",  
	                                            "eighty", "ninety"}; 
	  
	    String[] tens_power = new String[] {"hundred", "thousand"}; 
	  
	    /* Used for debugging purpose only */
	    System.out.print(String.valueOf(num)+": "); 
	  
	    /* For single digit number */
	    if (len == 1)  
	    { 
	        System.out.println(single_digits[num[0] - '0']); 
	        return; 
	    } 
	  
	    /* Iterate while num 
	        is not '\0' */
	    int x = 0; 
	    while (x < num.length)  
	    { 
	  
	        /* Code path for first 2 digits */
	        if (len >= 3) 
	        { 
	            if (num[x]-'0' != 0) 
	            { 
	                System.out.print(single_digits[num[x] - '0']+" "); 
	                System.out.print(tens_power[len - 3]+" ");  
	                // here len can be 3 or 4 
	            } 
	            --len; 
	        } 
	  
	        /* Code path for last 2 digits */
	        else
	        { 
	            /* Need to explicitly handle  
	            10-19. Sum of the two digits 
	            is used as index of "two_digits" 
	            array of strings */
	            if (num[x] - '0' == 1)  
	            { 
	                int sum = num[x] - '0' +  
	                    num[x] - '0'; 
	                System.out.println(two_digits[sum]); 
	                return; 
	            } 
	  
	            /* Need to explicitely handle 20 */
	            else if (num[x] - '0' == 2 &&  
	                    num[x + 1] - '0' == 0) 
	            { 
	                System.out.println("twenty"); 
	                return; 
	            } 
	  
	            /* Rest of the two digit  
	            numbers i.e., 21 to 99 */
	            else
	            { 
	                int i = (num[x] - '0'); 
	                if(i > 0) 
	                System.out.print(tens_multiple[i]+" "); 
	                else
	                System.out.print(""); 
	                ++x; 
	                if (num[x] - '0' != 0) 
	                    System.out.println(single_digits[num[x] - '0']); 
	            } 
	        } 
	        ++x; 
	    } 
	} 
	  
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a line:");
		String s= sc.nextLine();
		int lcount=0, wcount=1, lines=1, i;
		int len= s.length();
		for(i=0;i<len;i++) {
			if(s.charAt(i)!=' ') {
				lcount++;
			}
			if(s.charAt(i)==' ') {
				wcount++;
			}
			if(s.charAt(i)=='\n') {
				lines++;
			}
		}
		String s1= Integer.toString(lcount);
		String s2= Integer.toString(wcount);
		String s3= Integer.toString(lines);
		System.out.println("Letters= ");
		convert_to_words(s1.toCharArray());
		System.out.println();
		System.out.println("Words= ");
		convert_to_words(s2.toCharArray());
		System.out.println();
		System.out.println("Lines= ");
		convert_to_words(s3.toCharArray()); 

	} 
}
