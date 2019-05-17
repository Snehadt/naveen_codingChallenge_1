package qa.com.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.base.baseClass;
import qa.com.pages.agentPageZoopla;
import qa.com.pages.locationPageZoopla;
import qa.com.pages.loginPageZoopla;

public class locationtestZoopla extends baseClass{
	loginPageZoopla loginpage;
	locationPageZoopla locationPage;
	agentPageZoopla agentzooplaPage;
	public locationtestZoopla() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void propertyList() throws IOException{
		initialization();
		loginpage=new loginPageZoopla();
		//locationPageZoopla=new locationPageZoopla();
		locationPage=loginpage.inputLocation(properties.getProperty("location"));
		
	}
	
	@Test(priority=1)
	public void sortPrice () throws IOException{
		
		locationPage.sortInAscendingOrder();
	}
	
	@Test(priority=2)
	public void clickOn5thProperty() throws IOException{
		agentzooplaPage=locationPage.clickFifthElement();
	}
	
}
