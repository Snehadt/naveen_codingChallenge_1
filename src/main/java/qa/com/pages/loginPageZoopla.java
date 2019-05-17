package qa.com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.base.baseClass;

public class loginPageZoopla extends baseClass{
	
	@FindBy(id="search-input-location")
	WebElement inputLocation;
	
	@FindBy(id="search-submit")
	WebElement search_loginPage;
	
	public loginPageZoopla() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public locationPageZoopla inputLocation(String locationName) throws IOException
	{
		inputLocation.clear();
		inputLocation.sendKeys(locationName);
		search_loginPage.click();
		return new locationPageZoopla();
	}

}
