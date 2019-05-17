package qa.com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.base.baseClass;

public class agentPageZoopla extends baseClass{
	agentDetailsPageZoopla agentDetailsPage;
	
	@FindBy(xpath=".//a//h4[@class='ui-agent__name']")
	WebElement agentName;
	
 
	
	public agentPageZoopla() throws IOException {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String getAgentName(){
		String agentname=agentName.getText();
		return agentname;
	}
	
	public agentDetailsPageZoopla clickOnAgentNames() throws IOException
	{
		
		agentName.click();
		return new agentDetailsPageZoopla();
	}


	

}
