package listeners;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.ListenersInTestNG.class) //add class name if it want to implement in more classes withing {}
public class ListenerTestNG_Script {
	
	WebDriver driver = null;
	
	@Test
	public void test1() {
		
		WebDriverManager.chromedriver().setup(); // we can mention a particular version also
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		driver.findElement(By.id("abcd")).click(); // invalid xapath given
		System.out.println("I am inside tst1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside tst2");
		AssertJUnit.assertTrue(false);
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside tst3");
		throw new SkipException("This is skipped");
	}

}
