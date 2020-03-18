package com.syntax.class06;

public class Recap {
    public static void main(String[] args) {
	/*if hour between 1-11--> morning
	 * if hour between 12-15-->afternoon
	 * if hour between  16-20 -->evening
	 * if hour between 21-24--->night
	 */
    	
    	int hour=9;
    	String time;
    	if (hour>=1 && hour<=11) {
    		time="morning";
    	}else if(hour>=12 && hour<=15) {
    		time="afternoon";
    	}else if(hour>=16 && hour<=20) {
    		time="evening";
    	}else if(hour>=21 && hour<=24) {
    		time="night";
    	}else {
    		time="Unknown";
    	}
    	if(!time.equals("Unknown")) {
    		System.out.println("Right now is "+time);
    	}
}
}
