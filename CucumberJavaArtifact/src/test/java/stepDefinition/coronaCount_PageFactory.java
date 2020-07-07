package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CoronaCountPage1_PageFactory;
import pages.CoronaCountPage_POM;

public class coronaCount_PageFactory {
	
	WebDriver driver = null;
	CoronaCountPage1_PageFactory Ccount;
	String totalCoronaCount;
	String totalDeathCount;

	@Given("invoking website1")
	public void invoking_website() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/Drivers/chromedriver");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	@When("reading counts1")
	public void reading_counts() throws InterruptedException {
		driver.navigate().to("https://www.worldometers.info/coronavirus/#countries");
		Thread.sleep(3000);
		Ccount = new CoronaCountPage1_PageFactory(driver);
		Ccount.TotalCoronaCount();
		Ccount.TotalDeathCount();
	}

	
	@Then("displaying counts1")
	public void displaying_counts() throws InterruptedException {
		Ccount.DisplayCount();
		driver.close();
		driver.quit();
	}


}
