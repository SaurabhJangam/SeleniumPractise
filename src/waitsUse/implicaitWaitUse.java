package waitsUse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicaitWaitUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://discoveryplus.in/");
		//implicit wait
		//Applicable: complete webpage
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//80--ms-->920ms release
		WebElement signInButton =driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signInButton.click();
	}
}
