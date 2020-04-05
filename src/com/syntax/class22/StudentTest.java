package com.syntax.class22;

public class StudentTest {
public static void main(String[] args) {
	Student obj=new SyntaxStudent();
	obj.notes();
	obj.study();
	//obj.java();CE

	Student obj1=new CollegeStudent();
	obj1.notes();
	
	obj.study();
	Student obj2= new SchoolStudent();
	obj2.notes();
	obj.study();
	//SyntaxStudent obj2= new Student();
	// not all Syntax Students are students in the world
}
}
