package pol_test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POL_Base.Base;
import POL_POM.PolicyBazaarLoginPage;
import POL_POM.PolicyBazaarMyAccountPage;
import POL_Utility.Utility;

public class TC2_verifyUsernamePropertyfile extends Base {
	
	PolicyBazaarLoginPage login;
	PolicyBazaarMyAccountPage myAcc;

	@BeforeClass
	public void launchPolicyBazar() throws IOException {
		launchBrowser();
		login = new PolicyBazaarLoginPage(driver);
		myAcc = new PolicyBazaarMyAccountPage(driver);
	}

	@BeforeMethod
	public void signInToPolicyBazar() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Utility.implicitWait(driver,1000);
		login.clickOnSignInButton();
		Utility.implicitWait(driver,1000);
		login.enterMobNumber(Utility.readPropertyFile("mobNum"));
		Utility.implicitWait(driver,1000);
		login.clickOnSignInWithPasswordButton();
		Utility.implicitWait(driver,1000);
		login.enterPassword(Utility.readPropertyFile("pwd"));
		Utility.implicitWait(driver,1000);
		login.clickOnSignInButton2();
		Utility.implicitWait(driver,1000);
		login.clickOnMyAccount();
		Utility.implicitWait(driver,1000);
		login.clickOnMyProfile();
		Utility.implicitWait(driver,1000);
//		Switch to My Account Page window
		Set<String> allWinID = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(allWinID);
		driver.switchTo().window(l.get(1));
//		create object of my Account page
		Thread.sleep(5000);
	}
	
	
	@Test
	public void verifyUserName() throws EncryptedDocumentException, IOException {
		
		Assert.assertEquals(myAcc.getUsername(),Utility.readPropertyFile("userName"),"Username verification failed");
		
	}
	
	
	@AfterClass
	public void closePolicyBazar() {
		
		closeBrowser();

	}
  
}
