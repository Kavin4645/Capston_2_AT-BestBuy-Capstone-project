package TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UtilsBB.UtilsBestBuy;

public class TC_09_BrokenLinkValidationTest extends UtilsBestBuy {
	@BeforeTest
	public void setup() {
		testName = "TC_09_BrokenLinkValidationTest";
		testDescription = "Navigating to the BestBuy website and validate url is broken or not";
		testCategory = "Regression";
		testAuthor = "Kavin Vikram ";

	}

	@Test(priority = 9)

	public void brokenLinkBestbuy() throws Exception {
		String urlToCheck = "https://www.bestbuy.com/";

		@SuppressWarnings("deprecation")
		URL url = new URL(urlToCheck);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("HEAD");
		int responseCode = conn.getResponseCode();

		if (responseCode != HttpURLConnection.HTTP_OK) {
			System.out.println("The URL is broken.");
		} else {
			System.out.println("The URL is not broken.");
		}

	}
}