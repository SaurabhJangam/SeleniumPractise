package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childBrowserPopupUse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
//		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> s = driver.getWindowHandles();
		System.out.println();
		
		
		ArrayList<String >  a = new ArrayList<String>(s);
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		
		String mainPageID = a.get(0);
		String childPageID = a.get(1);
		
		driver.switchTo().window(childPageID);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("the7-search")).sendKeys("Good Morning");
		
		driver.close();
		
		
		driver.switchTo().window(mainPageID);
	}

}
