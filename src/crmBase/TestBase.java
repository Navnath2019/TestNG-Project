package crmBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void init()
	{
		System.setProperty("WebDriver.Chrome.Driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/");
	}
	
	public void login()
	{
		
	}
	
}
