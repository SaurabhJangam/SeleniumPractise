package frameWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import misctopics.commonMethods;


public class TC16_VerifyUsernameByUsingDataprovider {

	WebDriver driver;
	PolicyBazaarLoginPage p;
	PolicyBazaarMyAccountPage myAcc;

	@BeforeMethod
	public void launchApplication() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		commonMethods.implicitWait(driver, 1000);
	}

	
	@Test(dataProvider = "PolicyBdata",dataProviderClass = TC15_PolicyBazarDataProvider.class)
	public void verifyUsername(String mobNum, String password, String expName) throws EncryptedDocumentException, IOException, InterruptedException {
		p = new PolicyBazaarLoginPage(driver);
		p.clickOnSignInButton();
		commonMethods.implicitWait(driver, 1000);
		p.enterMobNumber(mobNum);
		commonMethods.implicitWait(driver, 1000);
		p.clickOnSignInWithPasswordButton();
		commonMethods.implicitWait(driver, 1000);
		p.enterPassword(password);
		commonMethods.implicitWait(driver, 1000);
		p.clickOnSignInButton2();
		commonMethods.implicitWait(driver, 1000);
		
		p.clickOnMyAccount();
		Thread.sleep(500);
		p.clickOnMyProfile();
//		Switch to My Account Page window
		Set<String> allWinID = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(allWinID);
		driver.switchTo().window(l.get(1));
//		create object of my Account page
		Thread.sleep(5000);
		myAcc = new PolicyBazaarMyAccountPage(driver);
		Assert.assertEquals(expName, myAcc.getUsername());
		
	}
	
	@AfterMethod
	public void logoutPolicybazar() {
		myAcc.clickLogout();
		driver.quit();
	}
}
