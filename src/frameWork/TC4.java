package frameWork;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 {

	
	@BeforeClass
	public void l() {
		System.out.println("Hello before class");
	}
	
	@BeforeMethod
	public void b() {
		System.out.println("Hello before method");
	}

	@Test(priority = 3,invocationCount = 2)
	public void y() {
		System.out.println("Hello y");
		Reporter.log("Helloo y",true);
	}
	
	@Test(priority = 0,enabled = true)
	public void x() {
		System.out.println("Hello x");
	}
	
	@Test(priority = -3,invocationCount = 3)
	public void z() {
		System.out.println("Hello z");
	}

	@AfterMethod
	public void a() {
		System.out.println("Hello after method");
	}
	
	@AfterClass
	public void h() {
		System.out.println("Hello after class");
	}

}
