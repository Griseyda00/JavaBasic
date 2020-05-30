package com.syntax.class29;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class Task2 {
	//Create a Set of cities
	//in which you want to make sure that insertion order is maintained.
	//Using Iterator remove any city that starts with “A”;
	public static void main(String[] args) {
		Collection<String> cities=new LinkedHashSet<>();
		cities.add("DC");
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("Alberta");
		System.out.println(cities);
		Iterator<String> r=cities.iterator();
		while(r.hasNext()) {
			if(r.next().startsWith("A")) {
				r.remove();
			}
		}
		System.out.println(cities);
		
	}
}
