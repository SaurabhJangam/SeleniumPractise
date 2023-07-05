package selniumClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	driver.findElement(By.xpath("//div[contains(text(),'Save upto Rs 250* on your bus tickets')]")).isDisplayed();
        System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Save upto Rs 250* on your bus tickets')]")).isDisplayed());
	}

}
