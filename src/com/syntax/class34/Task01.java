package com.syntax.class34;

public class Task01 {
public static void age(int age1 ) {
	int expected=16;
	if(age1<expected){
		throw new RuntimeException("Your too young");
	}else {
		System.out.println("You are eligeble");
	}
	
}
public static void main(String[] args) {
	age(15);
}
}

