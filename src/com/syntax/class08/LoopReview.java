package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {
	public static void main(String[] args) {
		
	
    Scanner scan;
    double price;
    scan=new Scanner(System.in);
    do{
    	System.out.println("Please enter price");
    	price=scan.nextDouble();
    }while(price !=2);
    System.out.println("Enjoy your candy");
	} 
	
}
