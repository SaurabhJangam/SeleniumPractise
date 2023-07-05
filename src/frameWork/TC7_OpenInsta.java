package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC7_OpenInsta {
  @Test
  public void insta() {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.instagram.com/");
	  driver.close();
  }
}
