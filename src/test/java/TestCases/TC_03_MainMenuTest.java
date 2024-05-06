package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicBB.BasicBestBuy;
import Class.MainMenuClass;

public class TC_03_MainMenuTest extends BasicBestBuy{
	@BeforeTest
	public void setup() {
		testName = "TC_03_MainMenuTest";
		testDescription = "Navigating to the BestBuy website and MainMenu";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";
		
	}
   @Test( priority = 3)
   public void TC_03_MainMenuTest() throws Exception {
	   MainMenuClass mc =new MainMenuClass(driver);
	   mc.MainMenu();
	   mc.reportStep(testAuthor, testCategory, testName);
	   
	   
   }
}
