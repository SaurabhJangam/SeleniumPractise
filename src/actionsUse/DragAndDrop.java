package actionsUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement amount = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement amountField = driver.findElement(By.id("amt8"));
		
//		scrollinto view to amountField
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", amountField);
		Thread.sleep(1000);
		
//		Method 1 Using action class
		Actions a= new Actions(driver);
		a.dragAndDrop(amount, amountField).perform();
		
		
//		Method 2 Without Action Class Old Method
		a.clickAndHold(amount).moveToElement(amountField).release().build().perform();
		

	}

}
