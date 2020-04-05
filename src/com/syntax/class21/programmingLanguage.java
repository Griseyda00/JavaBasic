package com.syntax.class21;

public class programmingLanguage {
 String name;
 String variable;
 public programmingLanguage(String name,String variable) {
	 this.name=name;
	 this.variable=variable;
 }
}
class java extends programmingLanguage{
	String constructor;
	java(String contructor,String name,String variable){
		super(name, variable);
		this.constructor=constructor;
	}
	
	public void details() {
		System.out.println(name+" can have variable "+variable+" and constructor"+constructor);
	}

}

//class JavaScript extends  programmingLanguage{
//	 
//	public void details() {
//		System.out.println(name+" can have variables "+variable);
//	}
//	
//}


