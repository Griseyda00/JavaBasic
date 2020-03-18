package com.syntax.class05;

import java.util.Scanner;

public class Task05 {
public static void main(String[] args) {
	Scanner scan;
	double a;
	double b;
	double c;
	 double result;
	scan=new Scanner(System.in);
	System.out.println("enter a number");
	a=scan.nextDouble();
	System.out.println("enter a number");
	b=scan.nextDouble();
	System.out.println("enter a nummer");
	c=scan.nextDouble();
	result=0;
	if(a>b && a>c) {
	    result=a;
	}else if(b>a && b>c) {
		result=b;
	}else if(c>a && c>b) {
		result=c;
	}else {
		System.out.println("equal numbers");
	}

	System.out.println("The larger number is "+result);
}
}
