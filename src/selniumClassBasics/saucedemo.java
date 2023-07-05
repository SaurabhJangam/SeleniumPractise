package selniumClassBasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		scrnsh(driver);
		
		Thread.sleep(1000);
		
//		Log In 
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		
//		Click On Bag
		
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(1000);
//		Back To Products
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(1000);
		
//		Click T shirt Add To Cart Button
		scrnsh(driver);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(1000);
		
//		Click On Cart
		driver.findElement(By.className("shopping_cart_link")).click();
		
//		Click On Checkout
		scrnsh(driver);
		
		driver.findElement(By.id("checkout")).click();
		
		Thread.sleep(1000);
		
//		Enter Information 
		scrnsh(driver);
		
		driver.findElement(By.id("first-name")).sendKeys("Omkar");
		driver.findElement(By.id("last-name")).sendKeys("Mirajkar");
		driver.findElement(By.id("postal-code")).sendKeys("415002");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
//		Click Finish
		scrnsh(driver);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		scrnsh(driver);
		Thread.sleep(1000);
		
		driver.close();
	}
	
	
	public static void scrnsh(WebDriver driver) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        
        String random = RandomString.make(4);
        
        File dest = new File("D:\\SAURABH\\Velocity Lectures\\Automation notes\\Selenium\\screenShots\\myScreenShot_"+random+".png");
        FileHandler.copy(source, dest);
	}

}
