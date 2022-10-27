package Testngproject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterex {
	
	@Test
	@Parameters("Name")
	public void printName(String name)
	{
		System.out.println("The name "+ name);
		
		
	}

}
