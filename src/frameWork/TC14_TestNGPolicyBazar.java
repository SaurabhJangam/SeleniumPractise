package frameWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import misctopics.commonMethods;

public class TC14_TestNGPolicyBazar {

	WebDriver driver;
	PolicyBazaarLoginPage p;
	PolicyBazaarMyAccountPage myAcc;

	@BeforeClass
	public void launchApplication() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		commonMethods.implicitWait(driver, 1000);
	}

	@BeforeMethod
	public void loginToPolicybazar() throws InterruptedException, EncryptedDocumentException, IOException {

		p = new PolicyBazaarLoginPage(driver);
		p.clickOnSignInButton();
		commonMethods.implicitWait(driver, 1000);
		p.enterMobNumber(commonMethods.raedExcelData(0, 0));
		commonMethods.implicitWait(driver, 1000);
		p.clickOnSignInWithPasswordButton();
		commonMethods.implicitWait(driver, 1000);
		p.enterPassword(commonMethods.raedExcelData(0, 1));
		commonMethods.implicitWait(driver, 1000);
		p.clickOnSignInButton2();
		commonMethods.implicitWait(driver, 1000);
	}

	@Test
	public void verifyUserName() throws InterruptedException, EncryptedDocumentException, IOException {
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
		myAcc.validateUserName(commonMethods.raedExcelData(0, 2));
		;
	}

	@AfterMethod
	public void logoutPolicybazar() {
		myAcc.clickLogout();

	}

	@AfterClass
	public void closeApplication() {
		driver.quit();
	}

}
