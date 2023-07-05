package webdriverMeth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		1. get- to enter url in browser or to open an application.
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		
		
		
//		2. close: to close the current tab of the browser opened by Selenium tool.
//		driver.close();
		
		
		
//		3. this method is use to open an application, move forward, backward & refresh the webpage.

//		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();

		
//		GET TITLE
		
//		GET current url


	}

}
