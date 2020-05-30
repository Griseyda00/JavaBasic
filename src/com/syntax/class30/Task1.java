package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.
  
	public static void main(String[] args) {
		Map<String,String> countries=new TreeMap<>();
		countries.put("El salvador","San Salvador");
		countries.put("USA","DC");
		countries.put("Spain","MAdrid");
		countries.put("Mexico","DF");
		Iterator<String> allEntries=countries.keySet().iterator();
		while(allEntries.hasNext()) {
			String key=allEntries.next();
			System.out.println(key+", "+countries.get(key));
		}
		System.out.println("-----------------");
		System.out.println("cities");
		for(String r:countries.values()) {
			System.out.println(r);
		}
		System.out.println("___________________");
		System.out.println("Countries");
		for(String r1:countries.keySet()) {
			System.out.println(r1);
		}
		//Iterator<Entry<String,String>> it=allEntries.
	}
}
