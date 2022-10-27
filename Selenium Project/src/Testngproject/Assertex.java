package Testngproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertex {

	String name = "Agni";
	boolean value = false;
	@Test
	public void assertion()
	{
		Assert.assertEquals(name, "Agni");
		Assert.assertFalse(value,"true");
		System.out.println("asser queal");
	}
}
