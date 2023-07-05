package frameWork;

import org.testng.annotations.DataProvider;

public class TC15_PolicyBazarDataProvider {
    @DataProvider(name = "PolicyBdata")
	public static String[][] policyData() {
		String data[][]= {{"9623153925","raju@2811","Rajashri Kadam"},{"9405888174","pallu12345","Pallavi Chaudhari"}};
		return data;
	}

}
