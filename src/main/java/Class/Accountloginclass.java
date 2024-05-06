package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicBB.BasicBestBuy;

public class Accountloginclass extends BasicBestBuy{
	//create an account
	@FindBy(xpath="//button[@id='account-menu-account-button']//*[name()='svg']")
	WebElement accountbut;
	
	//sign in page
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement clickonSignIn;
	@FindBy(xpath="//input[@id='fld-e']")
	WebElement mailid;
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement togglebutton;
	@FindBy(xpath="//input[@id='fld-p1']")
	WebElement Password;
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement signIn;
    @FindBy(xpath="//button[normalize-space()='Skip for now']")
    WebElement SkipFroNow;

   

	public  Accountloginclass(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	
    }
	
	public void loginBestbuy(String mail,String pwd) throws InterruptedException
	{
		
		clickOn(accountbut);
		clickOn(clickonSignIn);
		enter(mailid,mail);
		
		enter(Password,pwd);
		clickOn(signIn);
					
	}
	
	
	

}
