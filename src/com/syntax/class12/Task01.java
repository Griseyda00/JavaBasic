package com.syntax.class12;

public class Task01 {
public static void main(String[] args) {
	String name="Sunday";
	String letter="";
	for (int i =name.length()-1 ; i>=0; i--) {

		letter = letter+name.charAt(i);
	
	}
	System.out.println();
	System.out.println(letter);
	
	
}
}
