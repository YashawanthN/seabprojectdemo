package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.testng.annotations.DataProvider;

public class readTestdata extends Readpropertiesfiles{

	public static Workbook workbook;
	public static Sheet sheet;

	@DataProvider(name = "testDataSeab")
	public static Object[][] loginDataProvider() throws IOException {
		paths("paths");
		return getTestdata(Property.getProperty("testData"), 
				Property.getProperty("sheetName_signIN"));

	}

	public static Object[][] getTestdata(String fileName, String sheetName) {
		FileInputStream inputStream;
		Object[][] testData = null;
		try {

			// Create an object of FileInputStream class to read excel file
			inputStream = new FileInputStream(fileName);
			workbook = WorkbookFactory.create(inputStream);
			sheet = workbook.getSheet(sheetName);

			int noOfRows = sheet.getLastRowNum();
			System.out.println(noOfRows);
			int noOfCols = sheet.getRow(0).getLastCellNum();
			System.out.println(noOfCols);

			testData = new Object[noOfRows][noOfCols];

			for (int i = 1; i <= noOfRows; i++) {
				Row row = sheet.getRow(i);
				System.out.println(row.getRowNum());

				for (int j = 0; j < noOfCols; j++) {

					Cell cell = row.getCell(j);
					testData[i - 1][j] = cell.getStringCellValue();
				}
			}
			inputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("The exception is: " + e.getMessage());
		}
		return testData;
	}
}

/*
 * @DataProvider(name="LoginsData") public String[][] gettestdata(Method m)
 * throws EncryptedDocumentException, IOException {
 * 
 * File datafile = new File(System.getProperty("user.dir" +
 * "\\src\\test\\resources\\testdata\\testdata.xlsx")); FileInputStream
 * file_stream = new FileInputStream(datafile); Workbook wbook =
 * WorkbookFactory.create(file_stream); String excelfile = m.getName(); Sheet
 * sheetname = wbook.getSheet(excelfile);
 * 
 * DataFormatter format = new DataFormatter();
 * 
 * // Find out the last row number int totalrows = sheetName1.getLastRowNum();
 * System.out.println(totalrows);
 * 
 * // Get the cell of the first row Row rowcells = sheetName1.getRow(0);
 * 
 * // Find out the last column by using last Cell of the row int totalcolumns =
 * rowcells.getLastCellNum(); System.out.println(totalcolumns);
 * 
 * String testdata[][] = new String[totalrows][totalcolumns];
 * 
 * for(int i=1; i<=totalrows; i++) { for(int j=0; j < totalcolumns; j++) {
 * testdata[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
 * System.out.println(testdata[i-1][j]); } } return testdata;
 * 
 * }
 */
