package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicBB.BasicBestBuy;

public class ByBrandClass extends BasicBestBuy {
	@FindBy(xpath = "//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	@FindBy(xpath = "//button[@data-t='hamburger-navigation-button']")
	WebElement menuClick;
	@FindBy(xpath = "//button[normalize-space()='Brands']")
	WebElement clickbrand;
	@FindBy(xpath = "//a[normalize-space()='PlayStation']")
	WebElement PSMenu;
	@FindBy(xpath = "//a[text()='PS5 games']")
	WebElement PS5Games;
	@FindBy(xpath = "//button[@data-sku-id='6576381']")
	WebElement addToCart;
	
	public ByBrandClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void selectbyBrand() {
		clickOn(country);
		clickOn(menuClick);
		clickOn(clickbrand);
		clickOn(PSMenu);
		String expectedTitle = "Sony PlayStation 5: PS5 - Best Buy";
		if (driver.getTitle().startsWith(expectedTitle)) {
			System.out.println("title is validated");
		} else {
			System.out.println("title is not validated");
		}
		clickOn(PS5Games);
		
		clickOn(addToCart);
		if (addToCart.isDisplayed()) {
			addToCart.click();
			} else {
			System.out.println("Product is out of stock.");
			}

		
	}

}
