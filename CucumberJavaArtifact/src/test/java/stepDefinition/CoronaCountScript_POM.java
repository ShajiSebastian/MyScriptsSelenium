package stepDefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CoronaCountPage_POM;

public class CoronaCountScript_POM {
	
	WebDriver driver = null;
	String totalCoronaCount;
	String totalDeathCount;
	String totalCoronaCount2;
	String totalDeathCount2;

	@Given("Prerequisite settings")
	public void Prerequisite_settings() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/Drivers/chromedriver");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@When("Invoking page and reading counts")
	public void InvokingPageAndReadingCounts() throws InterruptedException {
		driver.navigate().to("https://www.worldometers.info/coronavirus/#countries");
		Thread.sleep(3000);
		//implementing as a common method
		totalCoronaCount = CoronaCountPage_POM.TotalCoronaCountElement(driver).getText();
		totalDeathCount = CoronaCountPage_POM.TotalDeathCountElement(driver).getText();
		
		//implementing as x path as variable
		totalCoronaCount2 = driver.findElement(By.xpath(CoronaCountPage_POM.TotalCoronaElement)).getText();
		totalDeathCount2 = driver.findElement(By.xpath(CoronaCountPage_POM.TotalDeathElement)).getText();
		
	}

	
	@Then("displaying counts")
	public void displaying_counts() throws InterruptedException {
		System.out.println("By implementing a common method:" );
		System.out.println("Corona count is: "+totalCoronaCount );
		System.out.println("Corona death count is: "+totalDeathCount );
		
		System.out.println("By implementing Xpath as variable:" );
		System.out.println("Corona count is: "+totalCoronaCount2 );
		System.out.println("Corona death count is: "+totalDeathCount2 );
		
		driver.close();
		driver.quit();
	}


}
