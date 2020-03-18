package com.syntax.class12;

public class MoreStringFuction {
public static void main(String[] args) {
	String me="I am a good tester";
	System.out.println("------ replace()function-------");
	//if it finds matching char sequence---> the replace
	String  newString=me.replace("a","c");
	System.out.println(newString);
	
	me=me.replace("good","great");
	System.out.println(me);
	//if it not finding matching sequence---> not replace
	me=me.replace("Great", "Awesome");
	System.out.println(me);
	//the output dont change
	String car="I have a Toyota";
	car=car.replace("Toyota", "Lexus");
	System.out.println(car);
	System.out.println("_-------replaceAll()Function");
	
	String str="Phone number is 1234567889";
	System.out.println(str);
	str=str.replaceAll("[A-Za-z]"," ");
	System.out.println(str);
	
	
	String str1="Hello12347**&&*   !!!89";
	str1=str1.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(str1);
	String subject="Java";
	subject=subject.replace("a","e").replace("J","I").toUpperCase();
	System.out.println(subject);
	System.out.println(subject.replaceFirst("E","g"));
}
}
