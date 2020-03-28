package com.syntax.class15;

public class MethodsReturningValue {
public static void main(String[] args) {
	String str="hello my friend";
	int length=str.length();
	String ans=null;
	if(length>10) {
		ans="String is long";
	}else {
		ans="String is short";
	}
	System.out.println(ans);
	//compare two numbers and then identify whether
	//number is even or odd
   //Task1 obj=new Task1();
   //int num=obj.numbers(10, 20);
   MethodsReturningValue newObj=new MethodsReturningValue();
     int num=newObj.largest(12, 13);
     System.out.println(num);
    boolean new1=newObj.isOdd(14);
     System.out.println(new1);
}
 int largest(int a,int b) {
	 int largest;
	 if(a>b) {
		 largest=a;
	 }else {
		 largest=b;
	 }
	 return largest;
 }
 boolean isOdd(int num) {
	 boolean isOdd;
	 if(num%2==0) {
		 isOdd=false;
	 }else {
		 isOdd=true;
	 }
	 return isOdd;
 }

}
