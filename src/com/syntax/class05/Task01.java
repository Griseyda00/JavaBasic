package com.syntax.class05;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your heigth in inches");
	int height=scan.nextInt();
	if(height>0 && height<=60) {
		System.out.println("you are short");
	}else if (height>=62 && height<=72) {
		System.out.println("you are medium height");
	}else if (height>72){
		System.out.println("You are tall");
	}else {
		System.out.println("invalid height");
	}
}
}
