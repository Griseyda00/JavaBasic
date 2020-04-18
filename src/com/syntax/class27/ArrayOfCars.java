package com.syntax.class27;


import java.util.ArrayList;

import java.util.Iterator;

public class ArrayOfCars {
	//Create an arraylist of cars 
	//and retrieve all the values using 3 different ways.
	public static void main(String[] args) {
		
	ArrayList<String> cars=new ArrayList<>();
	cars.add("BMW");
	cars.add("Mercedez");
	for(String car:cars) {
	System.out.println(car);
	
	}
	System.out.println("___________");
	for(int i=0;i<cars.size();i++) {
		System.out.println(cars.get(i)+" ");
	} 
	System.out.println(" =============");
	Iterator<String> car=cars.iterator();
	while(car.hasNext()) {
		System.out.println(car.next());
	}
	
	}
	
}

	