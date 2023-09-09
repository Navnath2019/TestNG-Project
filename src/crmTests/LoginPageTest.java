package crmTests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import crmBase.TestBase;
import crm_Pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;//for access login page property
	
	@BeforeMethod
	public void Initialization() 

	{
		init();
		loginPage = new LoginPage();
	}
//**************************************************************	
	@Test
	public void validatloginTest() 
	{
		login();
		//loginPage.login();
		
	} 	
	@Test
	public void validateLogoTest()
	{
		boolean Stetus = loginPage.isLogoDisplay();
		Assert.assertTrue(Stetus);//it axpect always true value 
	}
	
	@Test
	public void validateforgotPassword()
	{
		  loginPage.forgotPassword();
		  String forgotPasswordAttributeValue = driver.findElement(By.xpath("(//*[@type=\"submit\"])[2]")).getAttribute("value");
		  Assert.assertEquals(forgotPasswordAttributeValue, "Get Password");
	}
	
//************************************************************	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
//****************************************************************
}
