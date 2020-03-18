package com.syntax.class07;

public class Homework03 {
public static void main(String[] args) {
	int num=1;
	while(num<=20) {
		System.out.println(num);
		num+=2;
	}
	System.out.println("-------------------------------");
	int num1=1;
	while(num1<=20) {
		if(num1%2!=0) {
			System.out.println(num1);
		}
		num1++;
	}
	System.out.println("---------------------");
	int num2=1;
	while(num2<=20) {
		System.out.println(num2);
		num2++;
		num2++;
	}
	System.out.println("-----------------------");
	int num3=1;
	do {
		System.out.println(num3);
		num3++;
		num3++;
	}while(num3<=20);
	System.out.println("--------------------------");
	for(int i=1;i<=20;i++) {
		System.out.println(i);
		i+=2;
	}
	System.out.println("==================");
	for(int a=1; a<=20;a++) {
		if(a%2!=0) {
			System.out.println(a);
		}
		a++;
	}
}
}
