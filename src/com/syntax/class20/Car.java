package com.syntax.class20;

public class Car {
	String model,make;
	
public Car() {
	System.out.println("I'm a parent class constructor");
}
public Car(String make,String model) {
	this.make=make;
	this.model=model;
}
}
class Mercedes extends Car{
String sportModel;
public Mercedes() {
	//super();//compiler add super() by default to initialize the object
	System.out.println("I am child class constructor");
}
public void display() {
	System.out.println("I have "+make+" "+model+" "+sportModel);
}
public Mercedes(String make,String model,String sportModel) {
	super(make,model);
	this.sportModel=sportModel;

}
//Inheritance cannot have the same constructor 
// constructor are not inheritance

}
