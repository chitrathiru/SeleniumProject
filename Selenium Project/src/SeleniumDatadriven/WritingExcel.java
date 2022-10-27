package SeleniumDatadriven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp info");
		Object empdata[][]= {{"Empno","Name","Job"},
							 {100,"David","Engineer"},	
							 {101,"Smith","Manager"},
							 {102,"Scott","analyst"}		
							};
		int rows = empdata.length;//row count
		int cols = empdata[0].length;//column count
		
	/*	for (int r=0;r<rows;r++)
		{
			XSSFRow row = sheet.createRow(r);
			for (int c=0;c<cols;c++)
			{
			XSSFCell cell = row.createCell(c);	
		   Object value = empdata[r][c];
		   
		   if (value instanceof String)
			   cell.setCellValue((String)value);
		   if (value instanceof Integer)
			   cell.setCellValue((Integer)value);
		   if (value instanceof Boolean)
			   cell.setCellValue((Boolean)value);
			}
		}*/
		
		int rowcount = 0;
		
		for(Object emp[]:empdata)
		{
			XSSFRow row = sheet.createRow(rowcount++);
			int colcount = 0;
			for(Object value:emp)
			{
				XSSFCell cell = row.createCell(colcount++);
				if (value instanceof String)
					   cell.setCellValue((String)value);
				   if (value instanceof Integer)
					   cell.setCellValue((Integer)value);
				   if (value instanceof Boolean)
					   cell.setCellValue((Boolean)value);
			}
		}
			
		
		String Filepath = "/Users/chitra/Desktop/Chitra-QA/datafiles/Employees1.xlsx";
		System.out.println(Filepath);
		FileOutputStream outputstream = new FileOutputStream(Filepath);
		workbook.write(outputstream);
		outputstream.close();
		
		System.out.println("File created successfully....");
	}
	

}
