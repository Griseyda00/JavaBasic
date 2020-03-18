package com.syntax.class08;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner scan;
		int s = 0;
	
    int e = 0;
		int even = 0;
		int odds = 0;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter a range between 2 numbers");
		s = scan.nextInt();
		e = scan.nextInt();
		for (int i = s; i <= e; i++) {
			if (s < e) {
				if (i % 2 == 0) {
				even=even+i;
				
			} else {
				odds = odds + i;
			
			}
		}
		}
System.out.println(even);
System.out.println(odds);
	}

}
