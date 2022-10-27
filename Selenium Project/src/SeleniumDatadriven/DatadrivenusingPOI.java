package SeleniumDatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenusingPOI {

	public static String[][] getExcelData() throws IOException {
		
	

		FileInputStream excel = new FileInputStream("/Users/chitra/Desktop/Chitra-QA/datafiles/TestngDD.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(excel);
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rowcount = wsheet.getLastRowNum();//find no of row
		short celldata = wsheet.getRow(0).getLastCellNum();//find no of column
		//int phyrow = wsheet.getPhysicalNumberOfRows();
		String data[][] = new String[rowcount][celldata];
	for (int i = 1; i <=rowcount; i++) {
		//	
		XSSFRow row = wsheet.getRow(i);
		for (int j = 0; j < celldata; j++) {
			XSSFCell cell = row.getCell(j);
			DataFormatter Df = new DataFormatter();
			String value = Df.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			data[i-1][j]=value;
			//System.out.println(value);
		} 
	}
	wbook.close();
	return data;
	
		
		


	
	
		// TODO Auto-generated method stub
		
		
}
}
