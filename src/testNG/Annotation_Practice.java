package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_Practice {
	WebDriver driver;
	
	@BeforeMethod
	public void initialization() {
	System.setProperty("Webdriver.Chrome.driver", "E:\\Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://classic.freecrm.com/index.html");
	
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
	driver.findElement(By.name("password")).sendKeys("Speedway@2016");
	driver.findElement(By.cssSelector(".btn.btn-small")).click();
	driver.switchTo().frame("mainpanel");
	}
//************************************************************************************************
	@Test
	
	public void homePageLogo() {
	
		WebElement logo = driver.findElement(By.xpath("//td[text()='CRMPRO']"));
		System.out.println("CRMPRO Logo Dispayed :"+ logo.isDisplayed());
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
		
	}
		
	
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
}