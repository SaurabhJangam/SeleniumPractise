package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/recharge");

	}
	
	
	public static void scrnsh(WebDriver driver) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        
        String random = RandomString.make(4);
        
        File dest = new File("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\screenShots\\myScreenShot_"+random+".png");
        FileHandler.copy(source, dest);
	}

}
