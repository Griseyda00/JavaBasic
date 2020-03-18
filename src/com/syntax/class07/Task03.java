package com.syntax.class07;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
   Scanner scan;
   int number;
   int luckyNum=17;
   scan=new Scanner(System.in);
   do{
	  System.out.println("Please enter a number from 1-20");
	  number=scan.nextInt();
   }while(number!=luckyNum);
   System.out.println("You got it!");
 }
}
