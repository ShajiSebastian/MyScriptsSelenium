package Scripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead_Simple {

	//public static void main() throws IOException {
	public static void main(String[] args)throws IOException {
	
		XSSFWorkbook workBook = new XSSFWorkbook("/Users/a-4600/eclipse-workspace/SeleniumWithMaven/ExcelTestdata/TestData.xlsx"); // Will work for both xls and xlsx work sheet
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		//getting rows
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: " +rowCount);
		
		//getting columns
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns: " +colCount);


		//getting cell value
		String value1 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Cell value: " +value1);
	}

}
