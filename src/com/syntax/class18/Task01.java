package com.syntax.class18;

public class Task01 {
  Task01(){
	  System.out.println("I am inside the constructor");
  }
  Task01(String text){
	  System.out.println("I am inside a constructor with parameter");
  }
  public static void main(String[] args) {
	Task01 obj=new Task01();
	Task01 obj1=new Task01("Hello");
}
}
