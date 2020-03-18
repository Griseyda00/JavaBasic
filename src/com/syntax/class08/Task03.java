package com.syntax.class08;

public class Task03 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i >= 5 && i <= 7) {
				continue;
			}
			System.out.println(i);
		}
	}
}
