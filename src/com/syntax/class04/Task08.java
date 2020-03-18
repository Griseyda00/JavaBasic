package com.syntax.class04;

import java.util.Scanner;

public class Task08 {
     public static void main(String[] args) {
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("input city");
    	 String city=input.nextLine();
    	System.out.println("input tempeture");
    	int temp=input.nextInt();
    	int celsius=(temp-32)*5/9;
    	System.out.println("The tempeture in the city "+city+" is "
    			+ ""+celsius);
    	
    	
     }
}
