package qa.com.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import qa.com.base.baseClass;
import qa.com.pages.agentDetailsPageZoopla;
import qa.com.pages.agentPageZoopla;
import qa.com.pages.locationPageZoopla;
import qa.com.pages.loginPageZoopla;

public class agentTestZoopla extends baseClass{

	loginPageZoopla loginpage;
	locationPageZoopla locationPage;
	agentPageZoopla agentzooplaPage;
	agentDetailsPageZoopla agentdetailsPage;
	
	public agentTestZoopla() throws IOException{
		super();
	}
	@BeforeMethod
	public void propertyList() throws IOException{
		initialization();
		loginpage=new loginPageZoopla();
		//locationPageZoopla=new locationPageZoopla();
		locationPage=loginpage.inputLocation(properties.getProperty("location"));
		locationPage.sortInAscendingOrder();
		agentzooplaPage=locationPage.clickFifthElement();
		
	}
	
	
	public void clickOnAgentLogoName() throws IOException{
		
		agentzooplaPage.getAgentName();
		agentdetailsPage=agentzooplaPage.clickOnAgentNames();
		
	}
}
