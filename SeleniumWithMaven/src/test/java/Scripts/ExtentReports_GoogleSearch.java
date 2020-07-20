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
		
		ExtentHtmlReporter extentHtmlRprt = new ExtentHtmlReporter("/Users/a-4600/git/MyScriptsSelenium/SeleniumWithMaven/ExtentReportFolder/extentReport.html");
																	

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(extentHtmlRprt);

		ExtentTest test = extent.createTest("Invoke Google"," A sample test to check extent report by Shaji");
		test.pass("Going to start executon");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		test.log(Status.INFO,"Invoked browser");
		
		driver.get("https://google.com");
		test.pass("Navigated to google");
		System.out.println("Executed extent reports google search script");
		driver.close();
		extent.flush();
	}


}
