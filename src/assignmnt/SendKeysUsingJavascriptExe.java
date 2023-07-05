package assignmnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeysUsingJavascriptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.linkText("Create new account")).click();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(5000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='websubmit']")));
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement mail = driver.findElement(By.name("reg_email__"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Saurabh'", firstName);
		js.executeScript("arguments[0].value='Jangam'", lastName);
		js.executeScript("arguments[0].value='saurabh@test.com'", mail);
	}

}
