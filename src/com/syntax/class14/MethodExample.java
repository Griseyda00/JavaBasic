package com.syntax.class14;

public class MethodExample {
	
  // I want to create a method that will create  a person
	void greet(String name) {
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
   //Class name  name of obj=new ClassName();
		
	 MethodExample object=new MethodExample();
	 object.greet("Sarmed");
	 object.greet("Farid");
	 object.greet("John");
	 object.greet("Gulen");
	}
}
