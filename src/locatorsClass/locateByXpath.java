package locatorsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
//		1.xpath by attribute

//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Saurabh");
		
//		2. xpath bt text
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
//		driver.get("https://www.redbus.in/");
		
//		3. xpath by contains
		
//		i) Contains with text
//		If any non-breakable space (nbsp) is there.
//		//div[contains(text(),'Save upto Rs 250* on your bus tickets')]

		
//		driver.findElement(By.xpath("//div[contains(text(),'Save upto Rs 250* on your bus tickets')]")).click();
		
//		ii) Contains with attribute
//		driver.get("http://facebook.com");
		
//		//button[contains(@id,'u_0_5')]
		
//		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		
		
//		4. xpath by index
//		(//tagname[@attribute name = ‘attribute value’] )[2]

		
		
//		driver.get("https://www.neostox.com/");
//		
//		driver.findElement(By.xpath("//a[text()='Sign Up'][1]")).click();
		
		
		
		
		
		
		
		

	}

}
