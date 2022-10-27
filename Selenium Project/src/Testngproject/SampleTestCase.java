package Testngproject;

import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test(priority=0)//priority - to set the order of execution
	public void firstTestCase()
	{
		System.out.println("first test method");
	}

	@Test(priority = 2,enabled=false) //enabled - to skip execution
	public void musicOn()
	{
		System.out.println("music on");
	}
	
	
	@Test(priority=1)
	public void aboveTestCase()
	{
		System.out.println("seconf test method");
	}
}
