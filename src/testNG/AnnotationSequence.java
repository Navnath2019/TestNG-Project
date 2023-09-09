package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequence {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@Test
	public void test(){
		System.out.println("This is Demo Test");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("This is beforeSuiteAnnotation");
	}
	@AfterSuite
	public void suite(){
		System.out.println("This is beforeSuiteAnnotation");
	
	
	
	
	}
	
	
}