package frameWork;

import org.testng.annotations.Test;

public class TC_Keywords_Timeout {
  @Test(timeOut = 3000)
  public void f() throws InterruptedException {
	  Thread.sleep(4000);
  }
}
