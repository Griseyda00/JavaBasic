package com.syntax.class31;

import java.util.*;
import java.util.Map.Entry;

public class MapRecap {
public static void main(String[] args) {
	//lets create map of countries with capitals
	Map<String,String> hmap=new HashMap<>();
	hmap.put("USA", "Washington DC");
	hmap.put("Russia", "Moscow");
	hmap.put("France", "Paris");
	hmap.put("Tajikistan", "Dushanbe");
	hmap.put("Italy", null);
	hmap.put(null,"some value");
	hmap.put(null, "anoter value");// duplicate key, previous value will be overwritten
	hmap.put("Germany", null);
	System.out.println(hmap);
	//how to get all keys from a map? keySet(), entrySet();
	Iterator<String> it=hmap.keySet().iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("---Keys using entry set -----");
	Set<Entry<String,String>> entries=hmap.entrySet();
	Iterator<Entry<String,String>> iter=entries.iterator();
	//lets get both key and value
	while(iter.hasNext()) {
		Entry<String,String> entry=iter.next();
		String myEntry=entry.getKey()+"--"+entry.getValue();
		System.out.println(myEntry);
	}
	//how to get only values from a map? values(); entrySet();
	System.out.println("---values using values() method -----");
	Collection<String> values=hmap.values();
	it=values.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	//let's create hashtable of countries with capitals
	Map<String,String> htable=new Hashtable<>();
	htable.put("USA", "Washington DC");
	htable.put("Russia", "Moscow");
	htable.put("France", "Paris");
	htable.put("Tajikistan", "Dushanbe");
	//htable.put("Italy", null);---> we cannot store null values inside hashtable
	//htable.put(null,"some value")---> we cannot store null keys inside hashtable
	
	System.out.println(htable);
	System.out.println(createMap("lo","li"));
	System.out.println(createMap("li","la"));
}
public static Map<String,String> createMap(String key, String value) {
	Map map=new HashMap<>();
	map.put(key,value);
	return map;
}
}
