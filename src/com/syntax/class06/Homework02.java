package com.syntax.class06;

import java.util.Scanner;

public class Homework02 {
public static void main(String[] args) {
	Scanner scan;
	String country;
	String language;
	scan=new Scanner(System.in);
	System.out.println("Where you from?");
	country=scan.nextLine();
	switch(country.toLowerCase()) {
	case "el salvador":
		language="spanish";
		break;
	case "brasil":
		language="portugues";
		break;
		default:
			language="Unknown";
	}
	System.out.println("Your language is "+language);
}
}
