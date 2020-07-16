package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_GoogleSearch {	

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		WebDriver driver = new FirefoxDriver();
		driver.get("http:google.com");
		System.out.println("Invoked browser using Webdriver manager and searched google");
		driver.quit();
	}
}


