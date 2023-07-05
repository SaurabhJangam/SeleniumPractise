package misctopics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.name("q")).sendKeys("honda");
		
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
		for(WebElement s:searchResult) {
			String expeactedResult = "honda city";
			if(expeactedResult.equals(s.getText())) {
				s.click();
				break;
			}
		}
		
		driver.findElement(By.linkText("Images")).click();

	}

}
