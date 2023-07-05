package Drpdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		
		WebElement carsList = driver.findElement(By.id("cars"));
		
		Select s = new Select(carsList);
		
//		check if drop down is multiple selectable or not
		
		System.out.println(s.isMultiple());
		
//		Select Multiple Values
		s.selectByIndex(0);
		
		s.selectByValue("saab");
		
		s.selectByVisibleText("Audi");
		
		
		
		
//		Deselect value
		
		s.deselectByValue("saab");
		
		s.deselectAll();

	}

}
