package com.syntax.class19;

public class Student {
	//Write program as a Student class
	//that has instance variables name and address.
	//Create a constructor that will initialize those variables.
	//Print name & address of given  student using displayInfo method.
      String name;
      String address;
      public Student(String name,String address){
    	  this.name=name;
    	  this.address=address;
    	  
      }
      public void displayInfo() {
    	  System.out.println(name);
    	  System.out.println(address);
      }
      public static void main(String[] args) {
		Student obj=new Student("Laura","5612 galloway");
		obj.displayInfo();
	}
}
