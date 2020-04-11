package com.syntax.class24;

public abstract class File {
	//Create a class File
	//that will have the following behaviors:
	//open, edit, close.
	//Edit and close are implemented method
	//while open is an abstract.
	//Create 3 subclasses:
	//JavaFile, WordFile, PDFFile
	//that will provide specific implementation of open behaviour:
	//Example: to open .java file we need notepad++
	//or sublime text, to open
	//.doc file we need Microsoft word to be installed etc
	
	public abstract void open();
	public void edit() {
		System.out.println("edit");
	}
	public void close() {
		System.out.println("close");
	}
}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("We need notepad++ to open ");		
	}	
}
class WorldFile extends File{

	@Override
	public void open() {
	System.out.println("We need a microsoft word app to open");
		
	}
	
}
class PDFfile extends File{

	@Override
	public void open() {
		System.out.println("We need PDF reader to open");		
	}
	
}