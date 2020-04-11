package com.syntax.class25;

public class VehicleTest {
public static void main(String[] args) {
	Drivable obj=new Cars();
	//Drivable.MOVE_FAST=false;//its final cannot be change
	obj.drive();
	Cars obj1=new Cars();
	obj1.drive();
}
}
