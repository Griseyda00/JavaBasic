package com.syntax.class18;

public class Car {
	 String make,model,color;
	 int year;
	 public void printDetaails() {
		 System.out.println("I have a car "+make+model+" in "+
	 color+" color");
		 
	 }
	 public static void main(String[] args) {
		Car car1=new Car();
		System.out.println(car1.year);
		//compiler is not going to have problem because it 
		// knows that constructor assign default value to all 
		// instance variable
		System.out.println("----------------------------");
		// int door;
		//System.out.println(door);CE local variable must be
		// initialize before you print 
		
		
}
}