package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class read_testdata {
	
	@DataProvider(name="LoginsData")
	public String[][] gettestdata(Method m) throws EncryptedDocumentException, IOException {
		
		File datafile = new File(System.getProperty("user.dir" + "\\src\\test\\resources\\testdata\\testdata.xlsx"));
		FileInputStream file_stream = new FileInputStream(datafile);
		Workbook wbook = WorkbookFactory.create(file_stream);
		String excelfile = m.getName();
		Sheet sheetname = wbook.getSheet(excelfile);
		DataFormatter format = new DataFormatter();
		
		int totalrows = sheetname.getLastRowNum();
		System.out.println(totalrows);
		Row rowcells = sheetname.getRow(0);
		int totalcolumns = rowcells.getLastCellNum();
		System.out.println(totalcolumns);
		
String testdata[][] = new String[totalrows][totalcolumns];
		
		for(int i=1; i<=totalrows; i++)
		{
			for(int j=0; j < totalcolumns; j++)
			{
				testdata[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testdata[i-1][j]);
			}
		}
		return testdata;
		
	}

}
