package testNG_CRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test_Priority 
	{
	WebDriver driver;
	@BeforeMethod
	public void initialization()
	{
		System.setProperty("Webdriver.Chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.html");
		
	}
//******************************************	
	@Test
	public void validate_Login_Test()
	{	System.out.println("Login test is started");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
		driver.findElement(By.name("password")).sendKeys("Speedway@2016");
		driver.findElement(By.cssSelector(".btn.btn-sm")).click();
		driver.switchTo().frame("mainpanel"); 
	}
	
	
	@Test 
	public void validate_Test()
	{	System.out.println("Logo test case started");
		boolean result = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		System.out.println(result);
	}
	
	@Test 
	public void validateTitalTest()
	{
		System.out.println("Tital is Validated");
	}
//*****************************************	
	@Test 
	public void forgotPassword() 
	{
		System.out.println("Clicked on Forgot Password");
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
//*****************************************
	
}


