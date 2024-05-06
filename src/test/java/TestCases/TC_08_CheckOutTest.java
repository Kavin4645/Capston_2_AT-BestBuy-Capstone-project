package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.CheckOutClass;

public class TC_08_CheckOutTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_08_CheckOutTest";
		testDescription = "Navigating to the BestBuy website and Checkout";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
		
	}
	@Test(priority = 8)
	public void TC_07_CheckOutTest() throws Exception {
		CheckOutClass co = new CheckOutClass(driver);
		co.selectbyBrand("testuser03@gmail.com", "6382724043");
		co.carddetails("Test", "User", "TiruppurCity", "Tiruppur", "Tamil Nadu", "641606");
		co.reportStep(testAuthor, testCategory, testName);
	}

}
