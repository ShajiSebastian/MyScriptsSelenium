package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriorityInTestNG {	

	WebDriver driver = null;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
    public void method1()    {
		System.out.println("Method 1");
	}
	
	@Test(priority = -2)
    public void method2()     {
		System.out.println("Method 2");
	}
	
	@Test(priority = 2)
     public void method3()     {
		System.out.println("Method 3");
	}
	
	@Test(priority = 2)
     public void method4()     {
		System.out.println("Method 4");
	}
	
	@Test
     public void a_method5()     {
		System.out.println("Method 5");
	}
	
	@Test
     public void A_method6()     {
		System.out.println("Method 6");
	}


	@AfterTest
	public void quit() {

		driver.close();
		driver.quit();
	}
}


