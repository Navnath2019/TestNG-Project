package testNG_Groups_xml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTest {
	WebDriver driver;
	@BeforeMethod
	public void initialization()
	{
		System.setProperty("Webdriver.Chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
	}
	//******************************************	 
	 @Test(groups = "Regression" )
	 public void validateCreateContactTest()
	{              
		System.out.println("contact created successfully");	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
