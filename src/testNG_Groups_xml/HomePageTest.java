package testNG_Groups_xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	public class HomePageTest {
		WebDriver driver;
		@BeforeMethod
		public void initialization()
		{
			System.setProperty("Webdriver.Chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://classic.freecrm.com/index.html");
		}
		//******************************************	 
		
		@Test (groups = {"Regression", "Sanity"} )
		 public void logoutTest()
		 {          
			 System.out.println("Logout successfully");
		 }
		 @Test (groups = "Regression" )
		 public void redirectionOfcontact_Link()
		 {           
			 System.out.println("redirectes on create contact page");
		 }
		 
		 @AfterMethod
			public void tearDown()
			{
				driver.close();
			}
	}