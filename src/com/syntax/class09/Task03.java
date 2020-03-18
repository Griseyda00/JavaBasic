package com.syntax.class09;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("How many stars do you need?");
	int i=scan.nextInt();
	int j=scan.nextInt();
	for(int o=0;o<i;o++) {
		for(int u=0;u<=j;u++) {
			System.out.print("*");
		}
		System.out.println();
	}
			
}
}
