package com.syntax.class07;

import java.util.Scanner;

public class ScannersAndLoops {
	public static void main(String[] args) {
		Scanner scan;
		String name = null;
		int num = 1;
		scan = new Scanner(System.in);
		while(num<=3) {
			System.out.println("What is your name");
			name=scan.nextLine();
			System.out.println("Good afternoon "+name);
			num++;
		}
        
	}
}
