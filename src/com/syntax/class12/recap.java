package com.syntax.class12;

public class recap {
public static void main(String[] args) {
	String str="";
	System.out.println(str.isEmpty());
	String str1=null;//no value a all
	//System.out.println(str1.isEmpty());-->error NullPointerException
	String str2="good ";
	String str3="morning ";
	String str4="students";
	str2=str2.concat(str3).concat(str4);
	System.out.println(str2);
	 String str5="Day";
     int date=25;
     //str5.concat(date);CE:change type 
     String str6=" Hello ";
     String str7="Syntax";
//   str6=str6.concat(str7).trim();
//   System.out.println(str6);--> "Hello Syntax"
     str6=str6.trim().concat(str7);
     System.out.println(str6);//"HelloSyntax
	
	
}
}
