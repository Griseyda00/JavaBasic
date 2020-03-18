package com.syntax.class04;

import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter your work years");
    	int years=scan.nextInt();
    	if (years>=5) {
    		System.out.println("eligible for the bonus");
    		System.out.println("enter your annual salary");
    		long salary=scan.nextLong();
    		if (salary>50000) {
    			System.out.println("your bonus will be 5,000");
    		}else {
    			System.out.println("your bonus will be 3,000");
    		}
    	}else {
    		System.out.println(" your not eligible for the bonus");
    	}
    	
    	
    	
  
    	
    }
}
