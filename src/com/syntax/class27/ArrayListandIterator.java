package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListandIterator {
	public static void main(String[] args) {
		ArrayList<String> choco= new ArrayList<>();
		choco.add("a");
		choco.add("b");
		choco.add("c");
		ArrayList<String> sweets=new ArrayList<>();
		sweets.add("a1");
		sweets.add("b1");
		sweets.add("c1");
		sweets.addAll(choco);
		System.out.println(sweets.size());
		System.out.println(sweets);
		
	  Iterator<String> it= sweets.iterator();
		
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			if(element.equals("a1")) {
				it.remove();
			}
		}
		System.out.println(sweets);
		for(int i=sweets.size()-1;i>=0;i--) {
			System.out.print(sweets.get(i)+" ");
		}
		
	}
}
