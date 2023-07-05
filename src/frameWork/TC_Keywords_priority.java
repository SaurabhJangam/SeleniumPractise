package frameWork;

import org.testng.annotations.Test;

public class TC_Keywords_priority {
  @Test(priority = -2)
  public void a() {
	  System.out.println("Helo a");
  }
  
  @Test(priority = -4)
  public void c() {
	  System.out.println("Helo c");
  }
  
  @Test(priority = 0)
  public void b() {
	  System.out.println("Helo b");
  }
  
  @Test(priority = 3)
  public void e() {
	  System.out.println("Helo e");
  }
  
  @Test(priority = 4)
  public void f() {
	  System.out.println("Helo f");
  }
}
