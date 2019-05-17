package qa.com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.base.baseClass;

public class agentDetailsPageZoopla extends baseClass {

	@FindBy(xpath=".//h4[text()='Contact details']//following-sibling::p[1]//strong')")
	WebElement agentName;
	
	public agentDetailsPageZoopla() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void confirmAgentName(){
		
		
	}

}
