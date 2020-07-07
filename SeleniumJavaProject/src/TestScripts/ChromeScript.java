package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeScript {	
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/lib/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		driver.quit();
	}
}