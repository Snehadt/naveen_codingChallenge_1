package qa.com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

	public static WebDriver driver;
	public static Properties properties;
	public baseClass() throws IOException{

		properties=new Properties();
		FileInputStream fileInputStream=new FileInputStream("C:\\zooplaFolder\\zooplaArtifact\\src\\main\\java\\qa\\com\\propertiesFile\\config.properties");
		properties.load(fileInputStream);

	}

	public void initialization(){

		System.setProperty("webdriver.chrome.driver", "C:\\newMavenWorkspace\\rapid-test-execution-engine\\RapidTestExecutionEngine\\target\\classes\\drivers\\chromedriver.exe");


		driver=new ChromeDriver();
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(40000, TimeUnit.MILLISECONDS);
		driver.manage().deleteAllCookies();


	}



}
