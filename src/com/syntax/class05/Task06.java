package com.syntax.class05;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		double a = scan.nextDouble();
		System.out.println("Enter a number");
		double b = scan.nextDouble();
		System.out.println("Enter a number");
		double c = scan.nextDouble();
		double result = 0;
		if (!(a == b) && !(b == c)) {
				if (a > b && a > c) {
					result = a;
				}else if (c > b && c > a) {
					result = c;
				} else {
					result = b;
				}
		} else {
			System.out.println("numbers are equal");
		}
		if (!(result == 0)) {
			System.out.println("The larger number is " + result);
		}
	}
}
