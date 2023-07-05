package actionsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
				
		Actions a = new Actions(driver);
		
//		Right click
		
//		Method 1 
		a.contextClick(rightClickButton).perform();
		
//		Method 2
		Thread.sleep(2000);
//		a.moveToElement(rightClickButton).perform();
//		a.contextClick().perform();
		
		
//		Method 3
		
		a.moveToElement(rightClickButton).contextClick().build().perform();
		
		
//		Double click
		
//		Method 1
//		a.doubleClick(doubleClickButton).perform();
		
		
//		Method 2
//		a.moveToElement(doubleClickButton).doubleClick().build().perform();
	    
	}

}
