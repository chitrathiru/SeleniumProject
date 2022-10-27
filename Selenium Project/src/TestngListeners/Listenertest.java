package TestngListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listenertest extends TestListenerAdapter{
	
	
	
	
	public void onTestStart(ITestResult tr)
	{
	System.out.println("On start");	
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("On success");	
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("On failure");	
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("On skip");	
	}

}
