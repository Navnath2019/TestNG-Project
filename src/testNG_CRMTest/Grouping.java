package testNG_CRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping {
	WebDriver driver;
	@BeforeMethod
	public void initialization()
	{
		System.setProperty("Webdriver.Chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sastasafar.com/");
	}
//********************************************************************************************	
	@Test(priority = 1, timeOut = 20000, groups = "Regression Test")						//[1]
	public void fliteSearchTest()
	{  
		int a = 1;
		while (a<2)
		{
			System.out.println("Loading WebPage");
		}
//		driver.findElement(By.id("id=\"origin\"")).sendKeys("Aurangabad (IXU)");
//		driver.findElement(By.name("destination")).sendKeys("Pune (PNQ)");
//		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
	}
//********************************************************************************************	
	@Test(priority = 2, groups = {"Regression Test","Sanity test"})					//[2]
	public void flightBookTest()
	{ 
		System.out.println("booking flight");
		
	}
//********************************************************************************************	
	
	@Test(priority = 3, groups = {"Regression Test","Sanity test"})		 			//[3]
	public void paymentTest ()
	{
		System.out.println("payment completed");
	}
//********************************************************************************************	
	@Test(priority = 4, groups = "Regression Test")								 	 //[4]
	public void myTripTest()
	{
		System.out.println("validate my trip");
	}
//********************************************************************************************	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
//********************************************************************************************	
	
}


