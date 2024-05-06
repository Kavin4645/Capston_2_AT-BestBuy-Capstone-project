package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.BottomMenuValidateClass;

public class TC_04_BottamMenuValidateTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_04_BottamMenuValidateTest";
		testDescription = "Navigating to the BestBuy website and Menuvalidation";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
		
	}
	
	@Test( priority = 4)
	public void TC_04_BottamMenuValidateTest() throws Exception {
		BottomMenuValidateClass bm = new BottomMenuValidateClass(driver);
		bm.bottomLinks();
		bm.reportStep(testAuthor, testCategory, testDescription);
	}

}

