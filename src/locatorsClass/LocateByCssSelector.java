package locatorsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
//		Using Tag and ID
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Hello");
		
//		Using Tag and Class
		
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Saurabh");
		
		
		//CSS-->Tag and Attribute-->tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Hello");
		
		
		//CSS-->Tag, Class, and Attribute-->tag.class[attribute=value]
		
		
		driver.findElement(By.cssSelector("input.inputtext[id=pass]")).sendKeys("Bye");

	}

}
