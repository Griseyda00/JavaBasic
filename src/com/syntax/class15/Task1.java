package com.syntax.class15;

public class Task1 {
 void numbers(int a,int b ) {
	 int largest=0;
	 if (a>b) {
		 largest=a;
	 }else if(b>a) {
		largest=b;
	 }
	 System.out.println(largest);
 }
  public static void main(String[] args) {
	Task1 greater= new Task1();
	greater.numbers(10, 20);
}
}
