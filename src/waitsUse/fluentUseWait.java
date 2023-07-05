package waitsUse;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentUseWait {

	private static final int WebDriver = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(5000)).pollingEvery(Duration.ofMillis(5)).ignoring(NoSuchElementException.class);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	}

}
