package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxScript {	

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",projectPath + "/lib/Drivers/geckodriver");
		System.setProperty("webdriver.firefox.bin","/Applications/Firefox2.app/Contents/MacOS/firefox-bin");// need to say location if we have to invoke a particular one
		WebDriver driver = new FirefoxDriver();
		driver.get("http:google.com");
		System.out.println("Executed in Firefox using gecko driver");
		driver.quit();
	}
}