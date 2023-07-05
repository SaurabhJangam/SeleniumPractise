package frameWork;

import org.testng.annotations.Test;

public class TC_Keywords_enabled {
  @Test
  public void f() {
	  System.out.println("Helo f");
  }
  
  
  @Test(enabled = false)
  public void k() {
	  System.out.println("Helo k");
  }
  
  
  @Test(dependsOnMethods = "f")
  public void l() {
	  System.out.println("Helo l");
  }
}
