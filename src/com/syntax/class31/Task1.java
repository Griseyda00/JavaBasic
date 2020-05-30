package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
public static void main(String[] args) throws IOException {
	String filePath="/Users/griseydaperla/eclipse-workspace/javaBasics/configs/FileTask1";
	String userDirectory=System.getProperty("user.dir");
	String filePath1=System.getProperty("user.dir")+"configs/FileTask1";
	System.out.println(filePath1);
	System.out.println(userDirectory);
	
	FileInputStream fis=new FileInputStream(filePath);
	Properties prop=new Properties();
     prop.load(fis);
	String re=prop.getProperty("browser");
	String re2=prop.getProperty("url");
	System.out.println(re);	 
	System.out.println(re2);
}
}
