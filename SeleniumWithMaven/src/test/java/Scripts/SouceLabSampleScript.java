package Scripts;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//See your result in https://app.saucelabs.com/dashboard/tests/vdc ShajiSauceLab *8saucelab8*

public class SouceLabSampleScript {
	
	public static final String USERNAME = "ShajiSauceLab";
	public static final String ACCESS_KEY = "36161e34-d4b3-4ad6-89a0-226d57f5cd51";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10"); //We can give platform as Linux, Mac etc
		caps.setCapability("version", "latest");
//		caps.setCapability("name", "Sauce Lab Test1");
//		caps.setCapability("extendedDebuggion", "true");
//		caps.setCapability("buildNumber", "3.0");
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
//		WebDriverManager.chromedriver().setup(); 
//		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		System.out.println("Executed in Sauce Lab");
		driver.quit();
	
	}

}
