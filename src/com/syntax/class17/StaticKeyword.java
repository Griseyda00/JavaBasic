package com.syntax.class17;

public class StaticKeyword {
String color;
int memory;
static String brand;
static boolean touchScreen;
//return type, name, parameter
 static void displayGeneralInfo() {
	System.out.println("We are building "+brand+
			" with touch screen "+touchScreen);
}
	void displaySpecifications() {
		System.out.println("We build phone with "+memory+
				"GB memory in "+color);
	}
	public static void main(String[] args) {
		System.out.println("we are building "+brand);
	}
   
}
