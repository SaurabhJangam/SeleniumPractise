package frameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {
	
	@BeforeClass
	public void openURL() {
		System.out.println("Launch browser and open URL");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login to Redbus");
	}
	
	@Test
	public void bookBusTicket() {
	  System.out.println("Bus ticket booked succesfully.");
	}
	
	@Test
	public void changeTravelDate() {
	  System.out.println("Bus ticket date updated succesfully.");
	}
  
	@AfterMethod
	public void logout() {
		System.out.println("Logout From Redbus");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
}
