package frameWork;

import org.testng.annotations.Test;

public class TC_Keywords_invocationCount {
  @Test(invocationCount = 5)
  public void f() {
	  
	  System.out.println("Helo Saurabh");
  }
}
