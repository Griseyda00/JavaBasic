package com.syntax.class22;

public class Student {
void study() {
	System.out.println("All students study hard");
}
void notes() {
	System.out.println("All students take notes");
}
}
class SyntaxStudent extends Student{
	void study() {
		System.out.println("All SyntaxStudents study hard");
	}
	void notes() {
		System.out.println("All students take notes");
	}
	void java() {
		System.out.println("All students study java");
	}
}
class CollegeStudent extends Student{
	void study() {
		System.out.println("All CollegeStudents study hard");
	}
}
class SchoolStudent extends Student{
	
	void notes() {
		System.out.println("All students take notes");
	}
}