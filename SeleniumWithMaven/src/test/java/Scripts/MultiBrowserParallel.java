package Scripts;

import org.testng.annotations.Test;

//This script should be run from TestNG.xml

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiBrowserParallel {
	
	WebDriver driver = null;

	@Parameters("Browser")
	@BeforeTest
	public void setup(String Browser) {
		System.out.println("Browser invoked is:" +Browser);
		
		if(Browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		}
		if(Browser.equalsIgnoreCase("Firefox")){
			
			System.setProperty("webdriver.gecko.driver","/Users/a-4600/eclipse-workspace/SeleniumJavaProject/lib/Drivers/geckodriver");
			System.setProperty("webdriver.firefox.bin","/Applications/Firefox2.app/Contents/MacOS/firefox-bin");// need to say location if we have to invoke a particular one
			//WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();
		}
	}
		

	@Test
	public void search() {

		driver.get("http:google.com");
		System.out.println("executed in browser");
	}

	@AfterTest
	public void quit() {

		driver.close();
		driver.quit();
	}

}
