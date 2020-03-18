package com.syntax.class05;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("What day is today");
     int day=scan.nextInt();
     if (day>=1 && day<=5) {
    	 System.out.println("its a weekday");
     }else if(day>=6 && day<=7) {
    	 System.out.println("its a weekend");
     }else {
    	 System.out.println("day Invalid");
     }
     System.out.println("using ors");
     if(day==1|| day==2|| day==3 || day==4 || day==5) {
    	 System.out.println(" its a weekday");
     }else if(day==6 || day==7) {
    	 System.out.println("its a weekend");
     }else {
    	 System.out.println("invalid day");
     }
     
}
}
