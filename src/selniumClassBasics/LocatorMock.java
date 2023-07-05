package selniumClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorMock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abhishek");
	
//		By ID 
		
		driver.findElement(By.id("email")).sendKeys("Saurabh");
		
//		By Class
		
//		By name
		
		driver.findElement(By.name("email")).sendKeys("Jangam");
		
		driver.findElement(By.tagName("button")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Not")).click();
		
		//input[@id='identify_email']
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("AbhishekPawar");
		
		
		//button[text()='Search']
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		
		

	}

}
