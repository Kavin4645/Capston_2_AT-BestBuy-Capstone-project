package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicBB.BasicBestBuy;

public class MainMenuClass extends BasicBestBuy {
	@FindBy(xpath = "//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;

	public MainMenuClass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this );
		
	}
	public void MainMenu() {

		clickOn(country);
		String expectedTitle = "Best Buy International: Select your Country - Best Buy";
		if (driver.getTitle().startsWith(expectedTitle)) {
			System.out.println("title is validated");
		} else {
			System.out.println("title is not validated");
		}

	}

}
