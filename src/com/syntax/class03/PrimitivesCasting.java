package com.syntax.class03;

public class PrimitivesCasting {
public static void main(String[] args) {
	//widening happens implicitly
	double d=10;//10.10
	//int i=10.99;----> compile tibe error saying 
	//type mismatch, cannot convert double to int
	
	//narrowing, explicitly implementing
	int i=(int)10.99;
	System.out.println(i);
	//when u run ur value u might loose the value
	
	byte b=(byte)1286;
	System.out.println(b);
	// losing value 
	
	
	
	
}
}
