package com.syntax.class25;
public interface Drivable {
	//compiler by default adds public static final
 boolean MOVE_FAST=true;
 //compiler by default adds public abstract
 void drive();
}
abstract class Vehicles{
	abstract void stop();
}
class Cars extends  Vehicles implements Drivable{

	@Override
	public void drive() {
		
	System.out.println("Cars can drive");	
	}

    @Override
	void stop() {
System.out.println(" cars can drive");
		
	}
	
}

