package Class;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasicBB.BasicBestBuy;

public class BottomMenuValidateClass extends BasicBestBuy{
	//choose country
		@FindBy(xpath="//div[@class='country-selection']//h4[contains(text(),'United States')]")
		WebElement country;
		
		@FindBy(xpath="//a[@class='body-copy-sm mr-200']")
		List<WebElement> bottomlink;
		
		public BottomMenuValidateClass(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		public void bottomLinks()
		{
			clickOn(country);
			jsscrollDownBottom();	
			for(WebElement link:bottomlink)
			{
				String url=link.getAttribute("href");
				System.out.println(url);	
			}	
		}

}
