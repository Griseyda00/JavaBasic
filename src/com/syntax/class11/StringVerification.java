package com.syntax.class11;

public class StringVerification {
public static void main(String[] args) {
	String message="Welcome Admin!";
	System.out.println(message.contains("Admin"));
	boolean flag=message.contains("Welcome");
	System.out.println(flag);
	//we want to see if welcome starts with welcome
	System.out.println("****************");
	boolean starts=message.startsWith("Welcome");
	System.out.println(starts);
	//we want to verify that welcome ends with username
	System.out.println("*****************");
	String username="Admin";
	boolean ends=message.endsWith(username);
	System.out.println(ends);
	System.out.println(message.endsWith("!"));
	
}
}