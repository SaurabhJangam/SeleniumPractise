package frameWork;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Keywords_DependsOn {
  @Test
  public void a() {
	  Reporter.log("hello a",true);
  }
  
  @Test
  public void b() {
	  Reporter.log("hello b",true);
  }
  
  @Test(dependsOnMethods = "a",priority = 2)
  public void c() {
	  Reporter.log("hello c",true);
  }
  
  @Test
  public void login() {
	  Reporter.log("hello in",true);
  }
  
  @Test
  public void process() {
	  Reporter.log("hello process",true);
  }
  
  @Test(dependsOnMethods = {"login","process"})
  public void logout() {
	  Reporter.log("hello out",true);
  }
}
