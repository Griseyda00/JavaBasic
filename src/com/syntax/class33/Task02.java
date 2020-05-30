package com.syntax.class33;

import java.io.FileInputStream;
import java.util.*;

public class Task02 {
public static List<Exception> getList(){
	ArrayList<Exception> obj=new ArrayList();
	try {
		Thread.sleep(1000);
	}catch(Exception ei) {
		obj.add(ei);
	}
	String filePath="";
	try {
	FileInputStream fis=new FileInputStream(filePath)	;
	}catch(Exception ei) {
		obj.add(ei);
	}
	int a=10;
	int b=0;
	try {
		System.out.println("Im inside try");
		System.out.println(a/b);
	}catch(Exception ia) {
		obj.add(ia);
	}
	return obj;
}
public static void main(String[] args) {
	List<Exception> objs=getList();
	for(Object i:objs) {
		System.out.println(i);
	}
}
}
