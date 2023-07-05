package frameWork;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import misctopics.commonMethods;

public class TC1_POL_TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		commonMethods.implicitWait(driver, 1000);
		
//		crete object of PolicyBazaarLoginPage
		PolicyBazaarLoginPage p = new PolicyBazaarLoginPage(driver);
		p.clickOnSignInButton();
		Thread.sleep(2000);
		p.enterMobNumber();
		Thread.sleep(1000);
		p.clickOnSignInWithPasswordButton();
		Thread.sleep(1000);
		p.enterPassword();
		Thread.sleep(500);
		p.clickOnSignInButton2();
		Thread.sleep(500);
		p.clickOnMyAccount();
		Thread.sleep(500);
		p.clickOnMyProfile();
		
//		Switch to My Account Page window
		Set<String> allWinID = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(allWinID);
		driver.switchTo().window(l.get(1));
//		create object of my Account page
		Thread.sleep(5000);
		PolicyBazaarMyAccountPage myAcc = new PolicyBazaarMyAccountPage(driver);
		myAcc.validateUserName();

	}

}
