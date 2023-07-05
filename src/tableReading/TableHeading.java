package tableReading;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHeading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		List<WebElement> header = driver.findElements(By.tagName("th"));
		Iterator<WebElement> it = header.iterator();
		while(it.hasNext()) {
			System.out.print(it.next().getText()+ "|");
		}
		
		
		
	

	}

}
