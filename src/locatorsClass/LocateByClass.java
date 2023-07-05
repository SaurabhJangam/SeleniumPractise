package locatorsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
//		Locate By Class
		
		driver.findElement(By.className("inputtext")).sendKeys("Surabh J");
		
//		Locate By Id
		
		driver.findElement(By.id("email")).sendKeys("angam");
		
//		Locate by name
		
		driver.findElement(By.name("email")).sendKeys("126");
		
		// 5. Locator--> linked text
		// driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		//6. Locator-->Partial Linked Text
		driver.findElement(By.partialLinkText("Forgotten")).click();

	}

}
