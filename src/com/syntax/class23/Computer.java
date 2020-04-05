package com.syntax.class23;

public class Computer {
//	Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
//
//	Define common behavior within and some fields in parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Create objects of child classes and store them into array. Loop through each object and execute available methods.
	String Brand;
	Computer (String Brand){
		this.Brand=Brand;
	}
	void UseHeadPhones() {
		System.out.println("Computers use headphones");
	}
	void Keyword() {
		System.out.println("Computer use Keyword");
	}
	
	
}
class Apple extends Computer{
	Apple(String memory){
		super(memory);
	}
	void UseHeadPhones() {
		System.out.println("Apple Computers use headphones");
	}
	void start() {
		System.out.println("Apple starts with touch ID");
	}
}
class Lenovo extends Computer{
	Lenovo(String Brand){
		super(Brand);
	}
	void UseHeadPhones() {
		System.out.println("Lenovo Computers use headphones");
	
}
	void start() {
		System.out.println("Lenovo start with a turn on button");
	}
}
class HP extends Computer{
	HP(String Brand){
		super(Brand);
	}
	void Keyword() {
		super.Keyword();
		System.out.println("HP Computer use Keyword");
	}
	public void AccessParrentOveridenMethod() {
		super.Keyword();
	}
}

class Dell extends Computer{
	Dell(String Brand){
		super(Brand);
	}
	void UseHeadPhones() {
		System.out.println("Dell Computers use headphones");
	}
}

