package sizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriverMeth.WebdriverMethods;

public class setSizeUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.manage().window().getSize());
		 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.manage().window().getSize());
		
		Dimension d= new Dimension(600, 600);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		

	}

}
