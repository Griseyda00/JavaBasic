package com.syntax.class23;

public class Animal {
public static void whoAmI() {
	System.out.println("I am an animal");
}
}
class Bird extends Animal{
	//@Override
	public static void whoAmI() {
		System.out.println("I am a bird");
	}
}