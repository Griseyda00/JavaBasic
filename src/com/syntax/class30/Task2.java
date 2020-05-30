package com.syntax.class30;



import java.util.*;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {
//		Create a map of Best Buy store. Place
//		item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//
//		Retrieve all keys and values from a Best Buy map using EntrySet.
		Map<Integer,String> BestBuy=new TreeMap<>();
		BestBuy.put(11345, "TV");
		BestBuy.put(12346, "Laptop");
		BestBuy.put(12444, "Printer");
		Iterator<Entry<Integer,String>> r=BestBuy.entrySet().iterator();
		
		
}
}