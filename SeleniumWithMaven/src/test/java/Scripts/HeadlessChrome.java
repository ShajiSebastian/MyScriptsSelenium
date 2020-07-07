package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {
	

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		
	}

	@Test
	public void search() {

		driver.get("http:google.com");
		System.out.println("Executing script in Headless moode");
	}

	@AfterTest
	public void quit() {

		driver.close();
		driver.quit();
	}

}
