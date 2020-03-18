package com.syntax.class08;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
//Write a program to ask a user to enter item they want to buy
//	and the price of that item.
//	Every time user enters money accumulate
//	the amount and tell the user how much is left to pay off the amount.
//	If user give more money program should return a change.
//	Whenever a user done with payments program should say 
//	“Thank you for shopping!”
		String item;
		double price;
		double amount = 0;
		double change;
		double money;
		double remaning = 0;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("What are you buying today?");
		item = scan.nextLine();
		do {
			System.out.println("What is the price?");
			price = scan.nextDouble();
			System.out.println("Please pay for your item");
			money = scan.nextDouble();
			amount = amount + money;
			if (amount < price) {
				remaning = price - amount;
				System.out.println("Your remaning is " + remaning);
			} else if (amount > price) {
				change = amount - price;
				System.out.println("Your change is " + change);
				break;
			} else {
				System.out.println("Thank you");
			}

		} while (price != amount);

	}
}
