package groupExecution;

import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("testclass1-demo1-smoke");
	}
	@Test(groups="smoke")
	public void demo2()
	{
		System.out.println("testclass1-demo2-sanity");
	}
	@Test(groups="smoke")
	public void demo3()
	{
		System.out.println("testclass1-demom-smoke and sanity");
	}

}
