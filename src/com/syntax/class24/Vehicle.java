package com.syntax.class24;

public abstract class Vehicle {
	String color;
	static int totalVehicles=0;
	Vehicle(String color){
		this.color=color;
		totalVehicles++;
	}
public void drive() {
	System.out.println("vehicles drive");
}
public void stop() {
	System.out.println("vehicle stops");
	//can abstract methods be static? NO
	
	//public abstract static v1() {} CE
	//can abstract be final ?NO
	//public abstract final v1() {} CE
	//can abstract method be private? NO
	//void abstract void v1() {} CE
	
}
 public abstract void start();
 public abstract void brake();
}
abstract class Car extends Vehicle{
String carType;
	Car(String color,String carType) {
		super(color);
		this.carType=carType;
	}
	public void brake() {
		System.out.println(carType+" have a brakes");
	}
}
class Tesla extends Car{
 String make;
 Tesla(String color,String carType,String make){
	 super(color,carType);
	 this.make=make;
 }
	@Override
	public void start() {
		System.out.println(make+" Starts remotely");
		
	}
	public void display() {
		System.out.println("We have "+make+" "+carType+" "+color);
	}
}
class toyota extends Car{
String make;
	toyota(String color, String carType,String make) {
		super(color, carType);
		this.make=make;
	}

	@Override
	public void start() {
		System.out.println(make+" starts keyless");		
	}
	public void drive() {
		System.out.println(make+" drive");
	}
	
}