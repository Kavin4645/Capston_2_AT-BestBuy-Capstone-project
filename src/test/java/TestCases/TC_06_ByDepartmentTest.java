package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.ByDepartmentClass;


public class TC_06_ByDepartmentTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_06_ByDepartmentTest";
		testDescription = "Navigating to the BestBuy  website and Search by department";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
	}
	
	@Test( priority = 6)
	public void TC_06_ByDepartmentTest() throws Exception {
		ByDepartmentClass dc =new ByDepartmentClass(driver);
		dc.byDept();
		dc.reportStep(testCategory, testAuthor, testName);
	}
}
