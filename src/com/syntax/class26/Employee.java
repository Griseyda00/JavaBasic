package com.syntax.class26;

public class Employee {
//define private variables
	private String name;
	private int age;
	private double salary;
	//define public methods to give an access to private variables
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name=name;
	}
 public void setAge(int age) {
	 this.age=age;
 }
 public void setSalary(Double salary) {
	 this.salary=salary;
 }
}
