package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_GoogleSearch {	

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath + "/lib/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		System.out.println("Invoked browser using Webdriver manager and searched google");
		driver.quit();
	}
}


