package testNG_Groups_xml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void initialization() {
		System.setProperty("webDriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	 	driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
	
	}
//************************************************************************************************                                                //[1]
		@Test (priority = 1,groups = {"Regression", "Sanity"} )
		public void validateLoginTest ()
		
		{	
			System.out.println("Login test is started");
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
			driver.findElement(By.name("password")).sendKeys("Speedway@2016");
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			System.out.println("login successfully");
		}
		
	
//************************************************************************************************
	 @Test (priority = 2, groups = {"Regression", "Sanity"} )                                                //[2]
	 public void valildateLogoTest()
	 {              
		 System.out.println("Logo test is started");
		 boolean res = driver.findElement(By.xpath("(//img[@class='img-responsive'])")).isDisplayed();
		 System.out.println("Logo Display successfully");
	 }
//************************************************************************************************
	 @Test (priority = 3,groups = "Regression")                                                   //[3]
	 public void tital_Test()
	 {          
		 System.out.println("Tital is validated");
	 }
//************************************************************************************************
	 @Test(priority = 4,groups = "Regression")                                                    //[4]
	 public void Demo_Test()
	 {          
		 System.out.println("This is demo test");
	 }
//************************************************************************************************
	 @AfterMethod
		public void tearDown()
		{
			driver.close();
		}

//************************************************************************************************	
}
