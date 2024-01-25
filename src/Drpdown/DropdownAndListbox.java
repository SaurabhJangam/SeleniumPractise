package Drpdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownAndListbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
//		harish
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select date= new Select(day);
		
//		select by Value
		date.selectByValue("14");
	
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select smonth = new Select(month);
		
//		select By Index
		smonth.selectByIndex(5);
		
		WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select syear = new Select(Year);
		
//		select By Visible text
		syear.selectByVisibleText("1998");
		
		
		
		
//		check if any drop down is multiple selectable or not
		System.out.println("is multiple status is "+syear.isMultiple());
	}

}
