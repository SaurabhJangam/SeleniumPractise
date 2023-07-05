package scrollingPak;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Method 1
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(700,600)");  // (x,y)

		Thread.sleep(1000);
		js.executeScript("window.scrollBy(700,-300)");
		
		
//		Method 2
		WebElement popular_Categories = driver.findElement(By.xpath("//h2[text()='Popular Categories']"));
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", popular_Categories);

	}

}
