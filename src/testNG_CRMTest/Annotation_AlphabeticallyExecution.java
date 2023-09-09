package testNG_CRMTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_AlphabeticallyExecution {

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
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
		driver.findElement(By.name("password")).sendKeys("Speedway@2016");
		driver.findElement(By.cssSelector(".btn.btn-small")).click();
		driver.switchTo().frame("mainpanel");
	}
	
	@Test
	public void validate_Test()
	{
		boolean result = driver.findElement(By.cssSelector(".img-responsive")).isDisplayed();
		System.out.println(result);
	}
	
	@Test
	public void demoTest()
	{
		System.out.println("This is Demo Test");
	}
//*****************************************	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
//*****************************************
}

//Every Test Case before and after method will execute then next test case will start.
