package com.syntax.class24;

public class Vehicletest {
public static void main(String[] args) {
	//new vehicle("yellow");
	//new Car(sedan,yellow);
	
Vehicle tesla=new Tesla("yellow","sedan","Tesla");
tesla.brake();
tesla.drive();
tesla.stop();
//tesla.display(); i have to make a obj for tesla only
Tesla tesla1=new Tesla("white","sedan","Tesla");
tesla1.display();
 Vehicle toyota1=new toyota("red","rav4","Toyota");
 toyota1.drive();
 toyota1.brake();
 toyota1.stop();
 Vehicle truck1=new bus("blue ","rv","t");
 truck1.brake();
 truck1.drive();
 truck1.stop();
 Vehicle truck2=new tractor("white","l","e");
 truck2.brake();
 truck2.drive();
 truck2.stop();
 Vehicle truck3=new van("blue","lo","gg");
 truck3.brake();
 truck3.drive();
 truck3.stop();
System.out.println(Vehicle.totalVehicles);
}
}
