package com.syntax.class18;

public class ConstructorsIntro {

	//to create a constructor;
	//1. the name must be the same as class name
	//2. no return type(no even void)
	ConstructorsIntro(){
		System.out.println("I am constructor");
	}
	
	public static void main(String[] args) {
	ConstructorsIntro obj=new ConstructorsIntro();
	obj.hello();
	}
   void hello() {
	   System.out.println("hello class");
   }
}
