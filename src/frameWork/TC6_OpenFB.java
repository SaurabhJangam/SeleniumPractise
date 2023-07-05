package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC6_OpenFB {
  @Test
  public void facebook() {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.close();
  }
}
