package com.syntax.class12;

public class Task04 {
public static void main(String[] args) {
	String name="I am learning Java";
	String array=name.replace(" ","");
	System.out.println(array);
	System.out.println("-----Task05");
	String name1="Hello*1234567878";
	name1=name1.replaceAll("[0-9*]","");
	System.out.println(name1);
	System.out.println("-------Task06");
	String a="Is it saturday? Is it raining? Do we have a java class?";
	int counter=0;
	String[] ab=a.split("\\?");
	for(int i=0;i<ab.length;i++) {
		
		counter++;
	}
	System.out.println(counter);
}
}
