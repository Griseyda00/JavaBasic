package com.syntax.class25;

public class WedDriverTest {
public static void main(String[] args) {
	WebDriver obj=new ChromeDriver();
	obj.closeBrowser();
	obj.findElement(8);
	obj.maximizeWindow();
	obj.openBrowser();
	WebDriver obj1=new Firefox();
	obj1.closeBrowser();
	obj1.findElement(8);
	obj1.maximizeWindow();
	obj1.openBrowser();
	
}
}
