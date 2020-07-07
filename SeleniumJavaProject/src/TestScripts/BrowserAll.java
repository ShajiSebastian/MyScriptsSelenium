package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAll {	

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectPath + "/lib/Drivers/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox2.app/Contents/MacOS/firefox-bin");// need to say location if we have to invoke a particular one
		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
//		System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver.exe");
//		System.setProperty("webdriver.opera.driver", "/path/to/operadriver");
//		System.setProperty("phantomjs.binary.path", "/path/to/phantomjs");
//		System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");
		
		driver.get("http:google.com");
		driver.quit();
	}
}