package qa.com.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.com.base.baseClass;
import qa.com.pages.locationPageZoopla;
import qa.com.pages.loginPageZoopla;

public class logintestZoopla extends baseClass{
	loginPageZoopla loginpage;
	locationPageZoopla locationPage;
	//locationPageZoopla locationtestZoopla;
	
	public logintestZoopla() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		loginpage=new loginPageZoopla();
	}
	
	@Test
	public void enterLocation() throws IOException{
		locationPage=loginpage.inputLocation(properties.getProperty("location"));
		
		
		
		//.//ul//li[@id='listing_51312999']//following-sibling::div//a[@class='listing-results-price text-price']
	}
}
