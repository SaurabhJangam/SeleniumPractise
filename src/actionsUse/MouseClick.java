package actionsUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions a = new Actions(driver);
		
		WebElement seleniumButton =driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));

		
//		perform can be used for one action 
		a.click(seleniumButton).perform();
	}

}
