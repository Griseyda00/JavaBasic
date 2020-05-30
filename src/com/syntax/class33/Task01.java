package com.syntax.class33;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter an integer");
	try {
		int num=scan.nextInt();
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}
