package com.syntax.class18;

public class ConstructorDemo {
  static String str="Hello";
  ConstructorDemo(){
	  System.out.println("I am your constructor");
	  System.out.println("i am  non argument contructor");
  }
  ConstructorDemo(String str){
	  System.out.println("Constructor that has a parameter");
  }
  ConstructorDemo(int num){
	  System.out.println("I am a constructor with integer value="+num);
  }
  ConstructorDemo(String str,int num ){
	  System.out.println("I am a constractor with two 2 pararmeters:"+str+" & "+num);
	  
  }
  
  public static void main(String[] args) {
	System.out.println(str);
	ConstructorDemo obj=new ConstructorDemo();
	ConstructorDemo obj1= new ConstructorDemo("Today is java");
	ConstructorDemo obj2=new ConstructorDemo(12);
	ConstructorDemo obj3=new ConstructorDemo("Yes",13);
}
}
