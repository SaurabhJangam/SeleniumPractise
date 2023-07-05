package assignmnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownWithoutSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement color = driver.findElement(By.id("oldSelectMenu"));
		
//		Create object of action class
		
		Actions a = new Actions(driver);
		
//		Method 1
		a.click(color).perform();
		a.sendKeys("White").perform();
		a.sendKeys(Keys.ENTER).perform();
		
//		Method 2
		a.click(color).perform();
		a.sendKeys(color, Keys.HOME).perform();
		for(int i=0;i<5;i++) {
			a.sendKeys(color, Keys.ARROW_DOWN).perform();
		}
		a.sendKeys(Keys.ENTER).perform();

	}

}
