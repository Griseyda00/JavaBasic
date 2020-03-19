package com.syntax.class13;

public class InterviewQuestions {
public static void main(String[] args) {
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	System.out.println("second ");
	String  str1="Day";
	String str2="Night";
	String shortest=str1+str2;
	 str2=shortest.replace(str1,"");
	 str1=shortest.replace(str2,"");
	 System.out.println(str2);
	 System.out.println(str1);
			 
	
	
}
}
