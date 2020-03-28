package com.syntax.class18;

public class Task03 {
public Task03() {
	System.out.println("I am a public constructor");
}
protected Task03(String text) {
	System.out.println("I am a protected constructor");
}
private Task03(int num) {
	System.out.println("I am a private constructor");
}
Task03(String text,int num) {
	System.out.println("I am a default constructor");
}
 //static Task03(char a) {
//	System.out.println("I am static constructor therefore i will be CE");
//}
 public static void main(String[] args) {
	Task03 obj1=new Task03();
	Task03 obj2=new Task03("protected");
	Task03 obj3=new Task03(3);
	Task03 obj4=new Task03("default",4);
 }
}
