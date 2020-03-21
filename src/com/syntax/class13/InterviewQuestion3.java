package com.syntax.class13;

public class InterviewQuestion3 {
public static void main(String[] args) {
	int a,b,c;
	a=0;
	b=1;
	for(int i=1;i<=7;i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		
	}
}
}
