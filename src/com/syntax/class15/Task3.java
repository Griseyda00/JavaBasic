package com.syntax.class15;

public class Task3 {
 void pali(String given) {
	 String reverse="";
	 char[] charArray=given.toCharArray();
	 for(int i=charArray.length-1;i>=0;i--) {
		 reverse+=charArray[i];
	 }
	 if(given.contentEquals(reverse)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
 }
 public static void main(String[] args) {
	Task3 re=new Task3();
	re.pali("yolo");
}
}
