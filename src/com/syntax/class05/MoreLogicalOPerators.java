package com.syntax.class05;

public class MoreLogicalOPerators {
 public static void main(String[] args) {
	/*We have total 7 days in a week
	 * if day is 2,3--> SDLC class
	 * if day 4, 7--> Java class
	 * if day 1,5-->off day
	 * if day 4--> review class
	 */
	 int day=6;
	 //to compare numbers we use "=="
	 if(day==2 || day==3) {
		 System.out.println("Today is SDLC class");
	 }else if(day==6 || day==7) {
		 System.out.println("Today is Java class");
	 }else if(day==1 || day==5){
		 System.out.println("Today is not class");
	 }else if(day==4) {
		 System.out.println("Today is a review class");
	 }else {
		 System.out.println("Invlalid");	 
	 }
	 
	 System.out.println("using string");
	 String day1="Saturday";
	 //To compare String we use "equals"
	 if (day1.equals("Tuesday")|| day1.equals("wednesday")) {
		 System.out.println("Today is SDLC class");
	 }else if(day1.equals("Saturday")|| day1.equals("Sunday")) {
		 System.out.println("Today is Java class");
	 }else if (day1.equals("Monday")|| day1.equals("Friday")) {
		 System.out.println("Today is not class");
	 }else if (day1.equals("Thursday")){
		 System.out.println("Today is review");
	 }else {
		 System.out.println("Invalid day");
	 }
	 
}
}
