package com.syntax.class21;

public class Teacher {
String name,lastName;
public Teacher() {
	System.out.println("I am a parent class constructtor");
}
public Teacher(String name,String lastName) {
	this.lastName=lastName;
	this.name=name;
}
}
