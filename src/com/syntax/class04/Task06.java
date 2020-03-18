package com.syntax.class04;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
      System.out.println("What is the amout of loan?");
      int num1=input.nextInt();
     if (num1>200000) {
    	 System.out.println(" we can lend you "+num1);
     }else {
    	 System.out.println("We cannot lend you");
     }
    
 
		
		
	}

	

}
