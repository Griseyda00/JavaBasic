package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithString {
public static void main(String[] args) {
	Scanner scan;
	String country;
	String favFood;
	scan=new Scanner (System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	switch (country.toLowerCase()) {
	case "morocco":
		favFood="couscous";
		break;
	case "Tajikistan":
		favFood="Osh";
		break;
	case "Turkey":
		favFood="Baklava";
		break;
	case "Afghanistan":
		favFood="Mantu";
		break;
		default:	
			favFood="Invalid";
	}
	System.out.println("Your favorite food is "+favFood);
}
}
