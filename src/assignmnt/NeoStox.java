package assignmnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NeoStox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.neostox.com/sign-up");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
//		Enter Mobile Number
		driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("7972577435");
		driver.findElement(By.id("lnk_signup1")).click();
//		Enter Password
		driver.findElement(By.id("txt_accesspin")).sendKeys("2351");
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div/a[text()='OK'][@class='btn btn-sm neobutton'])[1]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"modal_renewplan\"]/div/div/div[1]/a/span")).click();
		WebElement xButton = driver.findElement(By.xpath("(//div[@id='modal_renewplan']//a[@class='close'  and @data-bs-dismiss='modal']/span[@aria-hidden='true'])[1]"));
		xButton.click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement xButton2 = driver.findElement(By.xpath("(//div[@id='modal_renewplan']//a[@class='close'  and @data-bs-dismiss='modal']/span[@aria-hidden='true'])[1]"));
		xButton2.click();
		
		
		WebElement currentBalance = driver.findElement(By.id("lbl_curbalancetop"));
		System.out.println(currentBalance.getText());
		Actions a = new Actions(driver);
		a.moveToElement(currentBalance).perform();
		
		Thread.sleep(1000);
//		driver.findElement(By.id("lnk_logout")).click();
//		driver.close();
	}

}
