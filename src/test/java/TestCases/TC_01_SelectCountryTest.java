package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.CountrySelect;
import UtilsBB.UtilsBestBuy;

public class TC_01_SelectCountryTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_01_LoginTest";
		testDescription = "Navigating to the BestBuy website and Select Country";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
		
	}
	@Test(dataProvider = "getFromExcel", priority = 1)
	public void TC_01_SelectCountryTest(String fname,String lname,String emailid,String conpassword,String repassword,String pNum) throws Exception {
		CountrySelect cs = new CountrySelect(driver);
		cs.country();
		cs.Signup(fname, lname, emailid, conpassword, repassword, pNum);
	    cs.reportStep(testAuthor, testCategory, testName);
	}
}
