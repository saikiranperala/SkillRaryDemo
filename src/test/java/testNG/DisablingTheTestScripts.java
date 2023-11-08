package testNG;

import org.testng.annotations.Test;

public class DisablingTheTestScripts {
	@Test(enabled = false)
	public void demo1() {
		System.out.println("hii");
	}
	@Test(enabled = true)
	public void demo2() {
		System.out.println("hello");
	}

}
