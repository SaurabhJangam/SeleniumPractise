package frameWork;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC13_SoftAssertUse {
  @Test
  public void f() {
	  SoftAssert s = new SoftAssert();
	  
	  
	  String s1 = "Saurabh";
		String s2 = "Saurabh";
		String s3 = "Jangam";
	  s.assertEquals(s1, s3);
	  s.assertEquals(s1, s2);
	  System.out.println("Hi Saurabh");
	  
	  s.assertAll();
	  
	  
  }
}
