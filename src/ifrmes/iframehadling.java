package ifrmes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframehadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("saurabh");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("janagm");
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText());
		
		driver.switchTo().frame("frame2");
		
		WebElement animal = driver.findElement(By.id("animals"));
		
		Select s = new Select(animal);
		
		s.selectByVisibleText("Avatar");
		
		
		
		
	

	}

}
