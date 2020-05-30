package com.syntax.class34;

public class Task02 {
	
public static void checkUserName(String userName) {
	
	if(userName.length()<=5) {
		throw new RuntimeException("UserName is less tha 6 characters ");
	}else {
		System.out.println("Your userName is "+userName);
	}
}
public static void main(String[] args) {
	checkUserName("lolo");
}
}
