package com.syntax.class04;

import java.util.Scanner;

public class Task09 {
     public static void main(String[] args) {
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("Do you have a credit card?");
    	 String creditC=input.nextLine();
        
    	 if(creditC.equals("yes")) {
    		 System.out.println("What is the balance?");
    		 int balance=input.nextInt();
    		 if (balance>1000) {
    			 System.out.println("Would you like to pay off your card?");
    		 }else{
    			 System.out.println("You can spend more!!");
    		 }
    	 }else {
    		 System.out.println("Would you like to have a credit card?");
    	 }
    	 
    	 
     }
     
}
