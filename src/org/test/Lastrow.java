package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lastrow {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\seleniuma\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_table.asp");
		driver.manage().window().maximize();
		
	}
			
	}