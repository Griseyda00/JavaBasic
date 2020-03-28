package com.syntax.class18;

public class ClassStudents {
String name;
int science;
int math;
int gov;
void calculate() {
	int[] array= {science,math,gov}; 
	int sum=science+math+gov;
	int average=sum/array.length;
	System.out.println("Your name is "+name+" and your average grade is "+average);
}
ClassStudents(String studentsname,int grade1, int grade2,int grade3){
	name=studentsname;
	science=grade1;
    math=grade2;
    gov=grade3;
}
public static void main(String[] args) {
	 ClassStudents obj1=new ClassStudents("Johhn",90,80,90);
	 obj1.calculate();
	 ClassStudents obj2=new ClassStudents("lucas",100,98,89);
	 obj2.calculate();
	 ClassStudents obj3=new ClassStudents("Pablo",99,100,99);
	 obj3.calculate();
	 
}
}
