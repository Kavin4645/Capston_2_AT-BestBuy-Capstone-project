package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.ByBrandClass;

public class TC_07_ByBrandTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_07_ByBrandTest";
		testDescription = "Navigating to the BestBuy website and Search by brand";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
		
	}
	
	@Test( priority = 7)
	public void TC_04_ByBrandTest() throws Exception {
		ByBrandClass bc =new ByBrandClass(driver);
		bc.selectbyBrand();
		bc.reportStep(testAuthor, testCategory, testName);
		
	}

}
