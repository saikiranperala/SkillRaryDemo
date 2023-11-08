package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods = "navigateToApp")
	public void loginToApp() {
		System.out.println("login");
	}
	@Test
	public void navigateToApp() {
		System.out.println("navigate");
	}

}
