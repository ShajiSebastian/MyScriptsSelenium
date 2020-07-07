package Scripts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGcumExtentReports {

	WebDriver driver = null;
	ExtentHtmlReporter extentHtmlRprt ;
	ExtentTest test =null;
	ExtentReports extent;

	@BeforeTest
	public void setup() {

		extentHtmlRprt = new ExtentHtmlReporter("/Users/a-4600/eclipse-workspace/SeleniumWithMaven/ExtentReportFolder/TestNGextentReport4.html");
		extent = new ExtentReports();
		extent.attachReporter(extentHtmlRprt);
	}

	@Test
	public void search() {

		test = extent.createTest("MyFirstTest","Sample test to check TestNG cum extent report");
		test.pass("details");
		test.log(Status.INFO,"Starting test case");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http:google.com");
		System.out.println("Invoked browser in TestNG with Extent reports");
	}

	@AfterTest
	public void quit()throws Exception{

		driver.close();
		driver.quit();
		test.pass("test completed");
		extent.flush();
	}


}
