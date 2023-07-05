package actionsUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement day = driver.findElement(By.id("day"));
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		
//		Select first value in drop down
		a.sendKeys(day, Keys.HOME,Keys.ENTER).perform();
	
		
//		Method 2 
		a.click(day).perform();
		a.sendKeys(day, Keys.HOME).perform();
		
		for(int i=1;i<14;i++) {
			a.sendKeys(day, Keys.ARROW_DOWN).perform();
		}
		
		a.sendKeys(day, Keys.ENTER).perform();	
		

	}

}
