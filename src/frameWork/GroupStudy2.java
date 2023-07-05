package frameWork;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy2 {
	@Test
	  public void myMethod6() {
		  Reporter.log("myMethod6 is running..", true);
	  }
	  
	  @Test(groups = "sanity")
	  public void myMethod7() {
		  Assert.fail();
		  Reporter.log("myMethod7 is running..", true);
	  }
	  
	  @Test
	  public void myMethod8() {
		  
		  Reporter.log("myMethod8 is running..", true);
	  }
	  
	  @Test(groups = "smoke")
	  public void myMethod9() {
//		  Assert.fail();
		  Reporter.log("myMethod9 is running..", true);
	  }
	  @Test(groups = {"smoke","sanity"})
	  public void myMethod10() {
//		  Assert.fail();
		  Reporter.log("myMethod10 is running..", true);
	  }
}
