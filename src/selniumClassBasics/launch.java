package selniumClassBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
//		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
//		driver.quit();
//		String title = driver.getTitle();
//		String expectedValue ="DEMOQA";
//		if(title.equals(expectedValue)) {
//			System.out.println("Actual and Expected Value Is Same , Pass");
//		}else {
//			System.out.println("Actual and Expected Value Is Not Same , Fail");
//		}
//		String currentURL = driver.getCurrentUrl();
//		System.out.println(currentURL);
		
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		userName.sendKeys("7952223333");
		userName.clear();
		userName.sendKeys("Abhishek");
		
//		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		WebElement myElement = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		myElement.getText();
		System.out.println(myElement.getText());

				
		
		
		
		
	
	
	}

}
