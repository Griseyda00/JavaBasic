package com.syntax.class11;

public class StringDema {
public static void main(String[] args) {
	String school=" Syntax ";
	String str= new String("HELLO");
	String str1="This a String 7676&^&";
	
	System.out.println(school.length());
	int size=str.length();
	System.out.println(size);
	
	System.out.println(school.toUpperCase());
	System.out.println(str.toLowerCase());
	str=str.toLowerCase();
	System.out.println(str);
	
	String newString=str+school;
	System.out.println(newString);
	
	String day="Saturday";
	String date="14";
	String newDate=day.concat(" "+date);
	System.out.println(newDate);
	char grade='A';
	String str2="Student";
	String tog=str2+" "+grade;
	System.out.println(tog);
	//below code will CE
	//since concat() method is used to attach 1 String to another
	//String 
	//str2.concat(grade);
	System.out.println("isEmpty func=========");
	//true or false 
	String str3="";
	boolean empty=str3.isEmpty();
	System.out.println(empty);
	System.out.println("Trim-------");
	String str4="     Welcome to Syntax      ";
	str4=str4.trim();
	System.out.println("String with no leading or trailling:"+str4);
	//removes empty spaces at begging and end
	
	
}
}
