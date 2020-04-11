package com.syntax.class24;

abstract public class Truck extends Vehicle{
   String truckType;
	Truck(String color, String truckType) {
		super(color);
	   this.truckType=truckType;
	}
  public void brake() {
	  System.out.println(truckType+" have a brake");
  }
}
class bus extends Truck{
 String make;
	bus(String color, String truckType,String make) {
		super(color, truckType);
	this.make=make;
	}
	public void start() {
	System.out.println(make+" starts with keys");	
	}
}
class tractor extends Truck{
	String make;
	tractor(String color,String truckType,String make){
		super(color,truckType);
		this.make=make;
	}
	public void start() {
		System.out.println(make+" starts with keys");
	}
}
class van extends Truck{
	String make;
	van(String color, String truckType,String make){
		super(color,truckType);
		this.make=make;
	}
	public void start() {
		System.out.println(make+" starts with fingerprint");
	}
}