package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		DesiredCapabilities caps =new DesiredCapabilities();
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		System.out.println("Invoked Desired capabilities Demo script");
	}

}
