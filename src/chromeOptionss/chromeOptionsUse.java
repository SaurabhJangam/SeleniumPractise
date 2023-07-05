package chromeOptionss;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptionsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions op = new ChromeOptions();
		
//		start-maximized: Opens Chrome in maximize mode
//		incognito: Opens Chrome in incognito mode
//		headless: Opens Chrome in headless mode
//		disable-extensions: Disables existing extensions on Chrome browser
//		disable-popup-blocking: Disables pop-ups displayed on Chrome browser
//		make-default-browser: Makes Chrome default browser
//		version: Prints chrome browser version
//		disable-infobars: Prevents Chrome from displaying the notification ‘Chrome is being controlled by automated software

		op.addArguments("headless");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		

	}

}
