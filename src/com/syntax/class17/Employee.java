package com.syntax.class17;

public class Employee {
//create variables to hold; name, lastName;title,SSN,salary
 public static String name;
 public String lastName;
 protected String tittle;
 double salary;
 private long ssn;
 public  static void method1() {
	System.out.println("I am public method"); 
 }
 protected void method2() {
	 System.out.println("I am protected method");
 }
 void method3() {
	 System.out.println("I am default method");
 }
 private void method4() {
	System.out.println("I am privite method"); 
 }
 public static void main(String[] args) {
	Employee emp=new Employee();
	emp.name="John";
	emp.lastName="Smith";
	emp.salary=900000;
	emp.ssn=123344448;
	emp.method1();
	emp.method2();
	emp.method3();
}
}
