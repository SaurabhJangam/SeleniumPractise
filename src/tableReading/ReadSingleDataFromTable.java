package tableReading;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleDataFromTable {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
//		Read Single Data From Table header
		
		WebElement headerData = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/th[3]"));
		System.out.println(headerData.getText());
		
		
//		Read Single Data From Table
		
		WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[1]"));
		System.out.println(data.getText());
	}

}
