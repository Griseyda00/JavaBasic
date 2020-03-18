package com.syntax.class10;

public class recap {
public static void main(String[] args) {
	String [] cities= {"Washington","New York","Paris","London"};
	System.out.println("I live in "+cities[0]);
	int x=1;
	System.out.println("I live in "+cities[x]);
	x+=1;
	System.out.println("I live in "+cities[x]);
	int arraySize=cities.length;
	System.out.println("total element "+arraySize);
	System.out.println("The last element is "+cities[arraySize-1]);
	
	for(int i=0; i<arraySize;i++) {
		System.out.println(cities[i]);
	}
}
}
