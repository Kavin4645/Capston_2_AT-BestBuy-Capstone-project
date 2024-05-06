package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.ByPageClass;

public class TC_05_ByPageTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_05_ByPageTest";
		testDescription = "Navigating to the BestBuy website and Add item by Searh";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
		
	}

	@Test( priority = 5)
	public void TC_05_ByPageTest() throws Exception {
		ByPageClass pc = new ByPageClass(driver);
		pc.addToCart("Dell core i5 7th generation");
		pc.reportStep(testAuthor, testCategory, testName);
	}
}
