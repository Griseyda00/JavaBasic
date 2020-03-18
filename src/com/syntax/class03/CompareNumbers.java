package com.syntax.class03;

public class CompareNumbers {
    public static void main(String[] args) {
    	double number1=10;
    	double number2=10;
    	if(number1>number2) {
    		System.out.println("number one is larger than number 2");
    	} else if(number1<number2) {
    		System.out.println("number one is smalller than number 2");
    	} else {
    		System.out.println("numbers are equal");
    	}
    System.out.println("------");
    int day=6;
    if(day==1) {
    	System.out.println("It is Monday, no class today");
    	} else if(day==2) {
    		System.out.println("It is tuesday, SDLC class today");
    		}else if (day==3) {
    			System.out.println("It is wednesday, we have SDLC class today");
    		}else if (day==4) {
    			System.out.println("It is thursday, we have review class");
    		}else if (day==5){
    			System.out.println("It is fryday,no class");
    		}else if (day==6) {
    			System.out.println("It is saturday, we have Java class");
    		}else if (day==7) {
    			System.out.println("It is sunday, we have java class");
    		}else { 
    			System.out.println("invalid weekday");}
    }
    
}
