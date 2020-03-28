package com.syntax.class16;

public class InstanceVaraible {
  String name="john";
  public static void main(String[] args) {
	String name="Yunus";
	System.out.println(name);
	InstanceVaraible obj=new InstanceVaraible();
	System.out.println(obj.name);
	obj.name="Ali";
	System.out.println(obj.name);
	name="Farid";
	System.out.println(name);
}
}
