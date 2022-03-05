package org.test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Middlerow{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\seleniuma\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tdata = driver.findElement(By.id("customers"));
		List<WebElement> allrows = tdata.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {
			WebElement text = allrows.get(i);
			String text2 = text.getText();
			System.out.print(text2);
				
		}
		for (int j = 7/2; j<allrows.size(); j++) {
			WebElement element = allrows.get(j);
			String text = element.getText();
			System.out.println(text);
		}
		
		for (int i = 6; i < allrows.size(); i++) {
			WebElement text3 = allrows.get(i);
			String text4 = text3.getText();
			System.out.print(text4);
			
			
		}
	}
	

}
