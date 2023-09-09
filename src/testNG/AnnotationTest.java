package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeMethod
	public void initialization()
	{
		System.out.println("Chrome Browser Instance is created");
		System.out.println("CRMPro url is loaded");
		
	}
	
	@Test
	public void validateLoginTest()
	{	
		System.out.println(" Input Username, password and clicked on login button");
		System.out.println("Logged in Successfully");
	}
	
	@AfterMethod
	
	public void closeInstance()
	{
		
		System.out.println("Closed Chrome Browser ");
	}
	
	
}
