package com.syntax.class17;

public class StaticKeywordTest {
public static void main(String[] args) {
	StaticKeyword.brand="Android";
	StaticKeyword.touchScreen=true;
	StaticKeyword sk=new StaticKeyword();
	sk.color="red";
	sk.memory=128;
	StaticKeyword sk1=new StaticKeyword();
	sk1.color="red";
	sk1.memory=128;	
	StaticKeyword sk2=new StaticKeyword();
	sk2.color="red";
	sk2.memory=128;	
	sk2.displayGeneralInfo();
	sk2.displaySpecifications();
}
}
