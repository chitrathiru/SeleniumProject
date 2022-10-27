package Testngproject;

import org.testng.annotations.Test;

public class DependeciedManagement {
	
	
	@Test(enabled=true)
	public void highSchool()
	{
		System.out.println("high school");
	}
	
@Test(dependsOnMethods = "highSchool")
	public void higherSecondary()
	{
		System.out.println("highersecondary");
	}

@Test(dependsOnMethods = "higherSecondary")
	public void college()
	{
		System.out.println("college");
	}
}
