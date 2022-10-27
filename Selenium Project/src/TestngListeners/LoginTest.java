package TestngListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginByEmail()
	{
		System.out.println("login email");
		Assert.assertEquals("chitra", "chitra");
	}
	
	@Test
	public void loginByFb()
	{
		System.out.println("Fb login");
		Assert.assertEquals("chitra", "thiruvengadam");
	}

}
