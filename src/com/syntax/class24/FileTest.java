package com.syntax.class24;

public class FileTest {
public static void main(String[] args) {
	File obj=new JavaFile();
	obj.open();
	obj.edit();
	obj.close();
	System.out.println("--------");
	File obj1=new WorldFile();
	obj1.open();
	obj1.edit();
	obj1.close();
	System.out.println("--------");
	File obj2=new PDFfile();
	obj2.open();
	obj2.edit();
	obj2.close();
	System.out.println("==============");
	File[] f= {new JavaFile(),new WorldFile(),new PDFfile()};
	for(File s:f) {
		s.close();
		s.edit();
		s.open();
		System.out.println("=========1");
	}
}
}
