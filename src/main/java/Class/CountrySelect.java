package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicBB.BasicBestBuy;
import UtilsBB.UtilsBestBuy;

public class CountrySelect extends BasicBestBuy{

	@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
	WebElement country;
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	WebElement accountbutton;
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createacc;
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement password;
	@FindBy(xpath="//input[@id='reenterPassword']")
	WebElement passwordreenter;
	@FindBy(xpath="//input[@id='phone']")
	WebElement phnum;
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement clickcreateacc;
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signInclick;
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement signInmailid;
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement togglebutton;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement signInpassword;
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signIn;
	

	
	
	
	public CountrySelect(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public Accountloginclass country() {
		clickOn(country);
		return new Accountloginclass(driver);
	}
	
	public void Signup(String fname,String lname,String emailid,String conpassword,String repassword,String pNum) throws InterruptedException 
	{
	    clickOn(accountbutton);
		clickOn(createacc);
	    enter(firstname,fname);
		enter(lastname,lname);
		enter(email,emailid);
		enter(password,conpassword);
		enter(passwordreenter,repassword);
		enter(phnum,pNum);
		clickOn(clickcreateacc);
	}
	  
	
	
}
