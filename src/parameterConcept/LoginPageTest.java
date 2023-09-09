package parameterConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest {
	WebDriver driver;
	@Parameters("url")
	@BeforeMethod
	public void initialization(String website) {
		System.setProperty("WebDriver.Chrome.driver", "\\D:\\Selenium\\chromedriver.exe\\");
	 	driver = new ChromeDriver();
		driver.get("website"); 
	}
//************************************************************************************************                                                 //[1]
		@Parameters({"username","password"})
		@Test (groups = {"Regression", "Sanity"} )
		public void validateLoginTest (String uname,String pwd)      
			{	
			System.out.println("Login test is started");
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			System.out.println("login successfully");
			}
		
	
//************************************************************************************************
	 @Test (priority = 2, groups = {"Regression", "Sanity"} )                                      //[2]
	 public void valildateLogoTest()
	 {              
		 System.out.println("Logo test is started");
		 boolean result = driver.findElement(By.xpath("(//img[@class='img-responsive'])")).isDisplayed();
		 System.out.println(result);
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
