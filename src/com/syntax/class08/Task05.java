package com.syntax.class08;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean creditCard;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you have a credit card?");
			creditCard = scan.nextBoolean();
			if (creditCard) {
				break;
			}

		}
	}
}
