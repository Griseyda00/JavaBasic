package com.syntax.class04;

public class NestedIfContinues {
     public static void main(String[] args) {
    	 //check if patient has any allergies
    	 //if no allergies
    	 boolean allergy=true;
    	 boolean appleAllergy=true;
    	 boolean orangeAllergy=false;
    	 boolean kiwiAllergy=false;
    	 if(allergy) {
    		 System.out.println("please answer bellow");
    	if (orangeAllergy) {
    		System.out.println("do not eat orange");
    	}else {
    		System.out.println("eat orange");
    	}	 
    	if(appleAllergy) {
    		System.out.println("do not eat apple");
    	}
    	if (kiwiAllergy) {
    		System.out.println("do not eat kiwi");	
    	}else {
    		System.out.println("eat kiwi");
    	}
    	 }else {
    		 System.out.println("you are healthy");;
    	 }
    	 
     }
}
