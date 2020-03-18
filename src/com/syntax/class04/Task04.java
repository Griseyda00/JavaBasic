package com.syntax.class04;

public class Task04 {
    public static void main(String[] args) {
	boolean diploma=false;
	double gpa=3.5;
	if (diploma) {
		System.out.println("congratulations");	
	}else {
	    System.out.println("you should get a degree");
   }
	if(gpa>=3.5) {
		System.out.println("You are eligible for scholarship");
	}else if(gpa<3.5){
		System.out.println("you should have studied harder");
	}else {
		System.out.println("nice, work");
	}
}

}
