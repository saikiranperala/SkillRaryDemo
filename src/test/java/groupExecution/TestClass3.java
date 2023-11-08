package groupExecution;

import org.testng.annotations.Test;

public class TestClass3 {
	@Test(groups="regression")
	public void demo1()
	{
		System.out.println("testclass3-demo1-regression");
	}
	@Test(groups="smoke")
	public void demo2()
	{
		System.out.println("testclass3-demo2-smoke");
	}
	@Test(groups={"regression","smoke"})
	public void demo3()
	{
		System.out.println("testclass3-demo3-regression and smoke");
	}

}
