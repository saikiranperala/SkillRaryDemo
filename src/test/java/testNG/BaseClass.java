package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void suiteConfigutarion() {
		System.out.println("before suite");
	}
	@BeforeTest
	public void testConfiguration() {
		System.out.println("before test");
	}
	@BeforeClass
	public void classConfiguration() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void methodConfiguration() {
		System.out.println("before method");
	}
	@AfterMethod
	public void methodTearDown() {
		System.out.println("after method");
	}
	@AfterClass
	public void classTearDown() {
		System.out.println("after class");
	}
	@AfterTest
	public void testTearDown() {
		System.out.println("after test");
	}
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("after suite");
	}

}
