package frameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC12_HardAssertionUse {
	@Test
	public void f() {
		String s1 = "Saurabh";
		String s2 = "Saurabhj";
		String s3 = "Jangam";

		Assert.assertEquals(s1, s2, "TC FAIL s1 and s2 are not equal");
//	  Assert.assertEquals(s1, s3,"TC FAIL s1 and s3 are not equal");

		Assert.assertNotEquals(s1, s3, "TC FAIL s1 and s3 are equal");
		Assert.assertNotEquals(s1, s2, "TC FAIL s1 and s2 are equal");
	}

	@Test
	private void p() {

		String s = null;
		String m = "Saurabh";

//	Assert.assertNull(m);
		Assert.assertNull(s, "s is not null");

		Assert.assertNotNull(m, "m is null");
		Assert.assertNotNull(s, "s is null");

	}
	
	
	@Test
	public void a() {
		boolean a = true;
		boolean b = false;
		
		Assert.assertTrue(a, "a is false");
		Assert.assertFalse(a, "a is true");
	}
}
