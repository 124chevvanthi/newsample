package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\seleniuma\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	text.click();
	WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	prompt.click();
	Alert al = driver.switchTo().alert();
	al.sendKeys("sakthi");
	Thread.sleep(3000);
	al.accept();
	WebElement text2 = driver.findElement(By.xpath("//p[@id='demo1']"));
	String text3 = text2.getText();
	System.out.println(text3);

	
	
	
	
	
	
	
	
	
	
	

	
}

}
