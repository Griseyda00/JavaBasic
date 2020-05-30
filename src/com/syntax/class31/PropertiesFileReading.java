package com.syntax.class31;
//shortcuts for import for windows ctrl+shif+o // for mac command+shif+o
import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {
public static void main(String[] args) throws IOException {
 //to read the file:
	//have file
	String filePath="/Users/griseydaperla/eclipse-workspace/javaBasics/configs/Example.properties";
	//2.bring object of fileInputStream
	FileInputStream fileInput=new FileInputStream(filePath);
	// to handle data from .properties file we need property class
	Properties prop=new Properties();
	prop.load(fileInput);
	String name=prop.getProperty("name");
	System.out.println(name);
	String city=prop.getProperty("city");
	System.out.println(city);
	Set<Object> Keys=prop.keySet();
	for(Object key:Keys) {
		System.out.println(key);
	}
	
}
}
