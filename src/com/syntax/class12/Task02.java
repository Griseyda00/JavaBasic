package com.syntax.class12;

public class Task02 {
public static void main(String[] args) {
	String name="ahahaHAHA";
	
	if(!(name.isEmpty())) {
		if(name.length()%2==1 && name.length()>=3) {
		System.out.println(name.charAt((name.length())));
		}
	}else { 
		System.out.println("Even numbers of characters");
	}
	//System.out.println(num1);
}
}
