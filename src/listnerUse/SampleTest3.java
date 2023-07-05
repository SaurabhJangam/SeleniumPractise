package listnerUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest3 {
	@Test
	  public void TC1() {
		  Reporter.log("TC1 is running", true);
	  }
	  
	  @Test(timeOut = 3000)
	  public void TC2() throws InterruptedException {
		  Thread.sleep(2000);
		  Reporter.log("TC2 is running", true);
	  }
	  
	  @Test(dependsOnMethods = "TC2")
	  public void TC3() {
		  Reporter.log("TC3 is running", true);
	  }
	  
	  @Test
	  public void TC4() {
		  Reporter.log("TC4 is running", true);
	  }
}
