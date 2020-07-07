package Scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Parameters_TestNG {
	
	public class ParameterDemo {
		
		WebDriver driver = null;

		@Parameters({"EmpName","EmpID"})
		@BeforeTest
		public void test1( String EmpName, int EmpID ) {
			System.out.println("Employee name is:" +EmpName);
			System.out.println("Employee ID is:" +EmpID);
			}
		
		@Parameters({"EmpName","EmpID"})
		@BeforeTest
		public void test2(@Optional String EmpName, @Optional int EmpID ) {  
			System.out.println("Employee name is:" +EmpName);
			System.out.println("Employee ID is:" +EmpID);
			}
		}
}
