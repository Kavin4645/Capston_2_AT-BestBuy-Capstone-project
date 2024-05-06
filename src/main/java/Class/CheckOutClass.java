package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicBB.BasicBestBuy;

public class CheckOutClass extends BasicBestBuy {
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
	@FindBy(xpath = "(//button[@class='c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button'])[1]")
	WebElement addToCart;
	@FindBy(xpath = "//span[@class='cart-label']")
	WebElement goToCart;
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	@FindBy(xpath = "//button[text()='clickOn']")
	WebElement ageis17;
	@FindBy(xpath = "//button[text()='Continue as Guest']")
	WebElement continueAsgest;
	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement email;
	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement PhoneNumber;
	@FindBy(xpath = "//span[normalize-space()='Continue to Payment Information']")
	WebElement clicknext;
	
	// card
	@FindBy(xpath = "//input[@id='number']")
	WebElement cardnumber;
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement fname;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lname;
	@FindBy(xpath = "//input[@id='address-input']")
	WebElement address;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='state']")
	WebElement state;
	@FindBy(xpath = "//input[@id='postalCode']")
	WebElement zipcode;
	@FindBy(xpath = "//span[text()='Place Your Order']")
	WebElement placeyourorder;

	public CheckOutClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectbyBrand(String Email, String Pnumber) throws Exception {
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
		Thread.sleep(1000);
		clickOn(addToCart);
		Thread.sleep(1000);
		waitExplicit(goToCart);
		clickOn(goToCart);
		//action(ageis17);
		clickOn(checkout);
		clickOn(continueAsgest);
		clickOn(continueAsgest);
		Thread.sleep(5000);
		enter(email, Email);
		enter(PhoneNumber, Pnumber);
		Thread.sleep(5000);
		clickOn(clicknext);

	}

	public void carddetails(String FName, String LName, String add, String City, String State, String Zip) {
		clickOn(cardnumber);
		clickOn(fname);
		clickOn(lname);
		clickOn(address);
		clickOn(city);
		selectByIndex(state, 50);
		clickOn(zipcode);
	}

	
}
