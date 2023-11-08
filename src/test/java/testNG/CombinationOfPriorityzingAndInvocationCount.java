package testNG;

import org.testng.annotations.Test;

public class CombinationOfPriorityzingAndInvocationCount {
	@Test(invocationCount = 2,priority = -2)
	public void demo1() {
		System.out.println("demo1");
	}
	@Test(invocationCount = 1,priority = 0)
	public void demo2() {
		System.out.println("demo2");
	}
	@Test(invocationCount = 0,priority = 1)
	public void demo3() {
		System.out.println("demo3");
	}
	@Test(invocationCount = 1,priority = 7)
	public void demo4() {
		System.out.println("demo4");
	}
	@Test(invocationCount = 1,priority = -3)
	public void demo5() {
		System.out.println("demo5");
	}
	@Test(invocationCount = 1,priority = -4)
	public void demo6() {
		System.out.println("demo6");
	}


}
