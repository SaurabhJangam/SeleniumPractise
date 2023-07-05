package frameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import misctopics.commonMethods;

public class DataDrivenFramework {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");

		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");

		commonMethods.implicitWait(driver, 1000);

		//click on signIn Button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(1000);;
		
		String userID = commonMethods.raedExcelData(0, 0);
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(userID);

	}

}
