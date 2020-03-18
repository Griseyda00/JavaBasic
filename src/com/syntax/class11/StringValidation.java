package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		String str1="Welcome Syntax Students";
		String str2="welcome syntax students";
		//compare to strings
		System.out.println("----- equalIgnorecase");
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("----- equalcase");
		System.out.println(str1.equals(str2));
		String expected="Home - Syntax Tech";
		String actual="Home - Syntax Tech ";
		System.out.println("(((((((((((((");
		//But the actual has a space so its going to fail
		if(actual.equals(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("Fails");
		}
		//To cut the space and pass
		if(actual.trim().equals(expected)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		System.out.println("*******************");	
		String browser="CHROME";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		

	}

}
