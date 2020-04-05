package com.syntax.class19;

public class ThisKeyword {
int a;
int b;
ThisKeyword(){
	System.out.println("I am non argument constructor");
}
public ThisKeyword(int a,int b) {
	this.a=a;
	this.b=b;
}
public void sum(int a, int b) {
	System.out.println("This is the sum of local variable "+(a+b));
	System.out.println("This is the sum of instance variable "+(this.a+this.b));
	
}
public static void main(String[] args) {
	
	ThisKeyword obj=new ThisKeyword (10,20);
	obj.sum(100,200);
	System.out.println("-------------");
	ThisKeyword obj1=new ThisKeyword();
	obj1.sum(20,40);
}
}   
