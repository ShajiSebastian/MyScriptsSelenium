package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Script {	

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		driver = new ChromeDriver();
	}

	@Test
	public void search() {

		driver.get("http:google.com");
		System.out.println("Invoked browser in TestNG");
	}

	@AfterTest
	public void quit() {

		driver.close();
		driver.quit();
	}
}


