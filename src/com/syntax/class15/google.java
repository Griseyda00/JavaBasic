package com.syntax.class15;

public class google {
 int empId;
 double salary;
 String name,lastName,tittle;
 void working()//method header 
 {//method body
 	System.out.println(tittle+" is working");
 }void getPaid(){
	 System.out.println(name+" is getting paid "+salary);
 }void attendMeeting(){
	 System.out.println(name+" attending meeting");
 }
 public static void main(String[] args) {
	google emp1=new google();
	emp1.name="John";
	emp1.empId=123;
	emp1.lastName="Smith";
	emp1.salary=200000;
	emp1.tittle="CEO"; 
	emp1.attendMeeting();
	emp1.working();
	emp1.getPaid();
	//creating second object
	google emp2=new google();
	emp2.name="Seyma";
	emp2.empId=124;
	emp2.lastName="Atasoy";
	emp2.salary=100000;
	emp2.tittle="QA Engineer";
	emp2.attendMeeting();
	emp2.working();
	emp2.getPaid();
	
}
}
