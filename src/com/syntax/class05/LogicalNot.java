package com.syntax.class05;

public class LogicalNot {
    public static void main(String[] args) {
		//NOT (!)-reverse the condition
    	boolean b=!true;
    	boolean val=!false;
    	 System.out.println(b);
    	 boolean isCold=!true;
    	 if (!isCold) {
    		 System.out.println("hello");
    	 }else {
    		 System.out.println("bye");
    	 }
    	 String day1="Tuesday";
    	 // it is not      monday    and  Friday
    	 if (! (day1.equals("Monday")&& day1.equals("Friday"))) {
    		 System.out.println("Find me a syntax");
    	 }
    	 
    	 // it is not monday    or  it is not Friday
    	 if (! day1.equals("Monday") || ! day1.equals("Friday")) {
    		 System.out.println("Find me a syntax");
    	 }
    	 
	}
}
