package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
public static void main(String[] args) {
	//Take age input from the user and then based on the age print output
     //first, lets declare all variable
	//capture values
	//perform verification
	Scanner scan=new Scanner(System.in);

	System.out.println("What is your age");
	
	int age=scan.nextInt();
	if (age >0) {
	if ((age>=0)&&(age<=3)) {
		System.out.println("you ared a baby");
	}else if(age>=3 && age<5) {
		System.out.println("you are a kid");
	}else if(age>6 && age<12) {
		System.out.println("you are a teenager");
	}else if (age>20 && age<65) {
		System.out.println("you are an adult");
	}else {
		System.out.println("You are enjoying your life");
	}
	}else {
		System.out.println("Please enter valid age");
	}
}
}
