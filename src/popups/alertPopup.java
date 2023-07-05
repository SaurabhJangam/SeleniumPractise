package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		WebDriver driver= new ChromeDriver();
//		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		
//		
//		
		Alert alert = driver.switchTo().alert();
//		
//		
//		Thread.sleep(2000);
//		System.out.println(alert.getText());
		alert.accept();
//		
		System.out.println(alert.getText());
//		
		alert.dismiss();
	}

}
