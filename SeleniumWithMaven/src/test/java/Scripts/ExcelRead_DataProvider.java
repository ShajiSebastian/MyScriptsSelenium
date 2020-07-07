package Scripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead_DataProvider {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		driver = new ChromeDriver();

	}

	//create a method for test. number of parameters should be equal to the test data columns
	@Test(dataProvider = "test1data")
	public void test1(String name, String ID) {
		driver.get("https://google.com/");
		System.out.println(name + " | " + ID);

	}

	
	@DataProvider(name = "test1data")
	public Object[][] getData() throws IOException{
		Object data[][] = testData();
		return data;

	}


	public Object[][] testData() throws IOException{
		
		XSSFWorkbook workBook = new XSSFWorkbook("/Users/a-4600/eclipse-workspace/SeleniumWithMaven/ExcelTestdata/TestData.xlsx"); // Will work for both xls and xlsx work sheet
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		//getting rows
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: " +rowCount);

		//getting columns
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns: " +colCount);

		//storing cell values in an Object by looping each row and columns
		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1; i < rowCount; i++) {
			for(int j=0; j <colCount; j++) {
				String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Cell value: " +cellData);
				data[i-1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}


	@AfterTest
	public void quit() {

		driver.close();
		driver.quit();
	}
}
