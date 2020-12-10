package com.session.practice;

public class ChromeTest {

	public static void main(String[] args) {


		ChromeDriver ch = new ChromeDriver();
		ch.prurl();
		ch.prgetTitle();
		ch.prfindElement();
		ch.prfindElements();
		ch.prquit();
		
		// using parent interface and chromedriver class object 
		//we can call only parent interface method
		RemoteWebdriver rm = new ChromeDriver();
		rm.prfindElement();
		rm.prfindElements();
		
		//using interface ref and chrome driver object
		//we can call all methods inside webdriver interface
		//this top casting we use in selenium. [real time eg of top casting]
		WebDriver wd = new ChromeDriver();
		wd.prfindElement();
		wd.prfindElements();
		wd.prgetTitle();
		wd.prquit();
		wd.prurl();
		
		
	}

}
