package com.syntax.class12;

public class SplitFunction {
	public static void main(String[] args) {
	System.out.println("-----split() FUNCTION----=---");
	String today="Today is my favorite java class";
	String[] array=today.split("my");
	System.out.println(array.length);
	System.out.println(array[0]);
	System.out.println(array[1]);
	
	
	String today1="Today is my favorite java class";
	String[] StringArray=today1.split("a");
	//print all elements from array one by one 
	//element type variableName=  name of the string
	for(String x:StringArray) {
		System.out.print(x+"@");
	}
	System.out.println();
	//we want to print string word by word
	System.out.println("---------------------");
	String today2="Today is my favorite java class";
	String[] word=today2.split(" ");
	for(int i=0;i<word.length;i++) {
		System.out.print(word[i]);
	}
	System.out.println("------------- TRIM ---------------");
    
    String today3="Today is my favorite Java class";
    today3=today3.trim();
    System.out.println("String after trimming:"+today3);
    
    //today3=today3.split(" ");CE: type mismatch --> split will give you back
    //array of Strings

	
	
}
}
