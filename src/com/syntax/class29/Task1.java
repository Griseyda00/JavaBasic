package com.syntax.class29;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {
	//Create a Set collection
	//in which you need to add names of the countries.
	//In this set we want all objects to be sorted in alphabetical order.
	//Using 2 different ways retrieve all elements from set.
	public static void main(String[] args) {
		Collection<String> name=new TreeSet<>();
		name.add("El salvador");
		name.add("USA");
		name.add("Spain");
		System.out.println(name);
		System.out.println("____________");
		for(String a:name) {
			System.out.print(a+" ");
		}
		
		Iterator<String> r=name.iterator();
		while(r.hasNext()) {
			System.out.print(r.next());
		}
	}
}
