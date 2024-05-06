package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.Accountloginclass;
import Class.CountrySelect;

public class TC_02_AccountLoginTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_02_AccountLoginTest";
		testDescription = "Navigating to the BestBuy website and login";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
	}
	@Test(priority = 2)
	
	public void TC_02_AccountLoginTest() throws Exception {
		CountrySelect cs = new CountrySelect(driver);
		cs.country();
		Accountloginclass ac =new Accountloginclass(driver);
		ac.loginBestbuy("testuser03@gmail.com", "TestUser03");
		ac.reportStep(testAuthor, testCategory, testDescription);
	}

}
