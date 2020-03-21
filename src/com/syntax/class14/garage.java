package com.syntax.class14;

public class garage {
 public static void main(String[] args) {
	// build individual objects
	Car car1=new Car();
	car1.make="Lamboghini";
	car1.model="Gallardo";
	car1.year=2020;
	car1.color="Blue";
	 
	Car car2= new Car();
	car2.make="BMW";
	car2.model="m5";
	car2.year=2019;
	car2.color="Pink";
	 
	Car car3=new Car();
	car3.make="123";
	System.out.println(car1.make+" "+car1.model);
	//accesing behavior/methods of car with
	car1.stop();
	car1.makeNoise();
	car1.accelerate();
	
	car2.stop();
	car2.makeNoise();
	car2.accelerate();
	 
   

	
	
	 
}
}
