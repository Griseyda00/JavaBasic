package com.syntax.class15;

public class Task2 {
void numbers(int a) {
	String re=null;
	if(a%2==0 ) {
		re="even";
	}else {
		re="odd";
	}
	System.out.println(re);
}
public static void main(String[] args) {
	Task2 one=new Task2();
    one.numbers(2);
}
}
