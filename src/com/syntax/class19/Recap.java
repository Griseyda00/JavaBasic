package com.syntax.class19;

public class Recap {
Recap(){
	System.out.println("constructor with not argument");
}
Recap(int num){
	System.out.println("constructor with 1 pararmeter");
}
public static void main(String[] args) {
 Recap obj=new Recap(2);
 //Recap obj=new Recap("hi");CE constructor is undefined
}
}
