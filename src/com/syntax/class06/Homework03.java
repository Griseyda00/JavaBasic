package com.syntax.class06;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
//	Using scanner class create calculator. Allow user to enter 
//2 numbers and operator(+,-,*,/). Based on operator provide the 
//	result to user.
		Scanner scan;
		double num1;
		double num2;
		double result;
		char operators;
		scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scan.nextInt();
		System.out.println("Please enter an operator?");
		operators = scan.next().charAt(0);
		System.out.println("Please enter second number");
		num2 = scan.nextInt();
		switch (operators) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			System.out.println("Invalid");
			return;
		}
		if(result!=0.0) {
		System.out.println("Your result is " + result);
		}
	}
}
