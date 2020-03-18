package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScannar {
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
    	 System.out.println("Please enter any text");
    	 String text=scan.nextLine();
    	 
    	 System.out.println(text);
     }
}
