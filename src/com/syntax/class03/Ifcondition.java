package com.syntax.class03;

public class Ifcondition {
  public static void main(String[] args) {
	
	//declare a number and compare if number is larger than 100
	//if number is larger than 100---> my number is large
	System.out.println("Starting coding");
	int num=178;
	if (num>1000) {
		System.out.println("My number is Large");
		}
	System.out.println("End of the program");
	
	System.out.println("-----");
	int expectedHours=15;
	int actualHours=4;
	//if actual is more than expected--> you will love java
	if (actualHours<=expectedHours) {
		System.out.println("You will love java");
	}else {
		System.out.println("You will not like Java");
		System.out.println("--------");
		double budget=10000;
		double carPrice=12000;
		
		if(budget==carPrice) {
			System.out.println("I will buy this car today");
		} else {
			System.out.println("I will not bvut this car today");
		}
       System.out.println("I love Java");
	
	}
  }
}
