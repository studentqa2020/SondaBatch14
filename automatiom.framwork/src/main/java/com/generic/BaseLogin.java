package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
	public static String login(){
		//coding==how to open a browser(chrome)
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");  //for chrome
		WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.com/");
driver.navigate().to("URL");
		
		
	
	
		return "name";
	}
	
	public static void main(String[] args) {
		BaseLogin.login();
		
	}

}
