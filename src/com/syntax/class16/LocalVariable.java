package com.syntax.class16;

public class LocalVariable {
  void nameInside() {
	  String name="John";//local variable that is visible
	  //only within method it was declared
  }
 public static void main(String[] args) {
	 // u cannot print name; name is no visible
	 LocalVariable obj=new LocalVariable();
	 obj.nameInside();
	 //is not going to execute either
	 boolean flag=true;
	 if(flag) {
		 String answer="Yes";
	 }
	 for(int i=1;i<=5;i++) {
		 System.out.println(i);
	 }
	 for(int i=1;i<=5;i++) {
		 System.out.println(i);
	 }
	 
	 
 }
}
