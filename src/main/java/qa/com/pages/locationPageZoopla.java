package qa.com.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.com.base.baseClass;

public class locationPageZoopla extends baseClass{
	public static List listAbc;
	agentPageZoopla agentzoopla;
	

	int count=0;
	Map map;
	@FindBy(xpath=".//ul//li//following-sibling::div//a[@class='listing-results-price text-price']")
	List<WebElement> listOfElements;

	public locationPageZoopla() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public void sortInAscendingOrder()
	{

		//List<WebElement> listOfElements=driver.findElements(By.xpath(".//ul//li//following-sibling::div//a[@class='listing-results-price text-price']"));
		listAbc=new ArrayList();
		map=new HashMap();
		for (WebElement list:listOfElements)
		{
			String[] unsortedList=list.getText().split(" ");
			String obtainedList=unsortedList[0];

			listAbc.add(obtainedList);
			//map.put(obtainedList, count++);
			//map.put(obtainedList);


		}
		System.out.println("lis object name is :"+listAbc);
		Collections.sort(listAbc);

		System.out.println("After sorting :"+listAbc);




	}
	
	public agentPageZoopla clickFifthElement() throws IOException
	{
		System.out.println(listOfElements.toArray());
		
		String elementatFour=listAbc.get(4).toString();
		 driver.findElement(By.xpath("//ul//li//following-sibling::div//a[contains(text(),'"+elementatFour+"')]")).click();
		 return new agentPageZoopla();

		
	}

}
