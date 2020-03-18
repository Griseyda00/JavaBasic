package com.syntax.class11;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Please eneter username and password");
		String username = scan.nextLine();
		System.out.println();
		String password = scan.nextLine();
		String message = null;
		if (!(username.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {
				if(!password.contains(username)) {
					System.out.println("Confirm ur password");
					String con=scan.nextLine();
					if(password.equals(password)) {
						
					}else {
						System.out.println("Password do not match");
					}
				}else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			 System.out.println("Please provide a password");
		}
		//System.out.println(message);

	}
}
