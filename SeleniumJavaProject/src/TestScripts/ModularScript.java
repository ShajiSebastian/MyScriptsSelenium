package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModularScript {	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		setBrowser();
		runTest();
	}
		
		public static void setBrowser() {

			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver",projectPath + "/lib/Drivers/geckodriver");
			System.setProperty("webdriver.firefox.bin","/Applications/Firefox2.app/Contents/MacOS/firefox-bin");// need to say location if we have to invoke a particular one
			driver = new FirefoxDriver();
			
		}
		public static void runTest() {
			
			driver.get("http:google.com");
			System.out.println("Browser is open");
			driver.quit();
		}

		
	}
