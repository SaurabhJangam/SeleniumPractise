package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC9_CrossBrowser {
	@Parameters("browserName")
	  @Test
	  public void openFB(String bName) {
		  WebDriver driver=null;
		  if(bName.equals("Chrome")) {
			  driver =new ChromeDriver();
		  }else if(bName.equals("Edge")) {
			   driver =new EdgeDriver();
		  }
		  else if(bName.equals("Firefox")) {
			   driver =new FirefoxDriver();
		  }
		  
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.close();
	  }
}
