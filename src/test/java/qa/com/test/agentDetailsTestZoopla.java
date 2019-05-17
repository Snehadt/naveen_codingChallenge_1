package qa.com.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.base.baseClass;
import qa.com.pages.agentDetailsPageZoopla;
import qa.com.pages.agentPageZoopla;
import qa.com.pages.locationPageZoopla;
import qa.com.pages.loginPageZoopla;

public class agentDetailsTestZoopla extends baseClass {
	
	public agentDetailsTestZoopla() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	loginPageZoopla loginpage;
	locationPageZoopla locationPage;
	agentPageZoopla agentzooplaPage;
	agentDetailsPageZoopla agentdetailsPage;
	
	@BeforeMethod
	public void agentDetails() throws IOException{
		initialization();
		loginpage=new loginPageZoopla();
		locationPage=new locationPageZoopla();
		locationPage=loginpage.inputLocation(properties.getProperty("location"));
		locationPage.sortInAscendingOrder();
		agentzooplaPage=locationPage.clickFifthElement();
		agentzooplaPage.getAgentName();
		agentdetailsPage=agentzooplaPage.clickOnAgentNames();
		
	}
	
	@Test
	
	public void getAgentInfo(){
		
	}
	

}
