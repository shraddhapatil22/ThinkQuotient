package com.SeleniumWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karti\\Documents\\chromedriver.exe");
		//Launch d browser
		WebDriver dr=new ChromeDriver();
		//Enter URL
		dr.get("https://online.actitime.com/smali/login.do");
		//Identify d Username
		WebElement wb=dr.findElement(By.id("username"));
		//Enter d value to username field
		wb.sendKeys("shraddhapatil910@gmail.com");
		//Identify d Password
		WebElement wb2=dr.findElement(By.name("pwd"));
		//Enter d value to Password field
		wb2.sendKeys("2bU6YR5D");
		WebElement wb3=dr.findElement(By.id("loginButton"));
		wb3.click();
	}

}
