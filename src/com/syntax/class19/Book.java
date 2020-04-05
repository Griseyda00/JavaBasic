package com.syntax.class19;

public class Book {
	//Write program as a Book class
	//that will have 2 Constructors.
	//While creating an object make sure
	//Instance variables are being initialized
	//Both Constructors are being executed
	 String Book;
	 String tittle;
	Book(String Book,String tittle){
		this();
		this.Book=Book;
		this.tittle=tittle;
		System.out.println("I am print first Book");
	}
	Book(){
		
		System.out.println("I am print second Book");
	}
	public static void main(String[] args) {
		Book obj=new Book("ede","oinwd");
	}
}
