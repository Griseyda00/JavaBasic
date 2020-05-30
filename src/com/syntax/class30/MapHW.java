package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {
public static void main(String[] args) {
	Map<Integer, String> building=new LinkedHashMap<>();
	//Entries with duplicate keys and values;
	building.put(1, "Google");
	building.put(2, "Syntax");
	building.put(3, "Google");
	building.put(4, "Amazon");
	building.put(4, "Amazon");
	building.put(5, "HP");
	building.put(6, "Microsoft");
	building.put(7, "Oracle");
	System.out.println(building.size());
	System.out.println(building);
	// how to get all keys
	Set<Integer> keys=building.keySet();
	System.out.println(building.keySet());//print set
	
	System.out.println("----getting keys using iterator ----");
	Iterator<Integer> keysIt=keys.iterator();
	while(keysIt.hasNext()) {
		
	}
	
	
	
	
}
}
