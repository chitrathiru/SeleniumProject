package SeleniumDatadriven;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Datautils {
	
	@DataProvider()
	public String[][] loginData() throws IOException {
		String[][] exceldata = DatadrivenusingPOI.getExcelData();
		return exceldata;
	}

}
