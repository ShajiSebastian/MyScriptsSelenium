package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports_GoogleSearch {

	public static void main(String[] args) {
		
		ExtentHtmlReporter extentHtmlRprt = new ExtentHtmlReporter("/Users/a-4600/eclipse-workspace/SeleniumWithMaven/ExtentReportFolder/extentReport_shaj.html");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(extentHtmlRprt);

		ExtentTest test = extent.createTest("MyFirstTest","Sample test to check extent report");
		test.pass("details");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO,"Starting test case");
		
		driver.get("https://google.com");
		test.pass("Navigated to google");
		System.out.println("Executed extent reports google search script");
		extent.flush();
	}


}
