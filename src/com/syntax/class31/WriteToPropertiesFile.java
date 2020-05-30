package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		//write into existing file and add values
		String filePath="/Users/griseydaperla/eclipse-workspace/javaBasics/configs/Example.properties";
		FileInputStream fis=new FileInputStream(filePath);
	Properties prop =new Properties();
	prop.load(fis);
	prop.setProperty("phoneNumber", "123456689");
	FileOutputStream fos= new FileOutputStream(filePath);
	prop.store(fos, "added additional key");
	}
}
