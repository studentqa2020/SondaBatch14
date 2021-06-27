package com.generic2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogUsa implements Baselogin {
//+inheritance+ POLYMORPHISUM
	public void login() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // for chrome
	//	WebDriver driver = new ChromeDriver();
		//driver.navigate().to("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();// max size
		//driver.manage().window().fullscreen();//full size
		
		//driver.findElement(By.xpath("//*[@class='login']")).click();
		//driver.findElements(by);
		//email =//*[@id='email']
	//	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
		//driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");




System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // for chrome
	WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();// max size
		//driver.manage().window().fullscreen();//full size
		
		driver.findElement(By.xpath("//*[@class='login']")).click();
		//driver.findElements(by);
		//email =//*[@id='email']
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("student");
		
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	//driver.close();
	driver.quit();//best
	
	
	
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}



}
