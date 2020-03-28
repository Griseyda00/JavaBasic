package com.syntax.class18;

public class BestCar {
String make,color,model;
int year,door,wheels;
public void printDetails() {
	System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
	System.out.println(make+" has "+door+" doors and "+wheels+" wheels");
}
BestCar(String Carmake, String CarColor, String CarModel,int CarYear,int CarDoor,int CarWheels){
	make=Carmake;
	color=CarColor;
	model=CarModel;
	year=CarYear;
	door=CarDoor;
	wheels=CarWheels;
	
}
public static void main(String[] args) {
	//once we create out own constructor compiler will not be creating a default constructor
	//for you
	//BestCar car=new BestCar(); CE
	BestCar car=new BestCar("BMW","blue","m5",2020,4,5);
	car.printDetails();
}
}
