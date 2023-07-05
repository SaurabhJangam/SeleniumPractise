package selniumClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		
		
//		s.selectByIndex(1);
		
//		s.selectByValue("INDIA");
		
		s.selectByVisibleText("INDIA");
		
		Thread.sleep(3000);
		
		s.deselectByVisibleText("INDIA");
		
//		System.out.println(s.isMultiple());
		
//		WebElement cars = driver.findElement(By.id("cars"));
//		
//		Select c = new Select(cars);
//		
//		System.out.println(c.isMultiple());
////		c.selectByVisibleText("Volvo");
////		c.selectByVisibleText("Saab");
//		
//		c.deselectAll();
		
		

	}

}
