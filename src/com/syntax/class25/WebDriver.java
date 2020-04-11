package com.syntax.class25;

public interface WebDriver {
void openBrowser();
void closeBrowser();
void maximizeWindow();
int findElement(int b);
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
	System.out.println("Open");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("maximize window");
		
	}

	@Override
	
	public int findElement(int b) {
		double u;
	System.out.println("find Element");
	  return b;
	}
	
}
class Firefox implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("maximize window");
		
	}

	@Override
	public int findElement(int b) {
		System.out.println("find Element");
		return b;
	}
	
}