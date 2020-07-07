package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver = null;

	@Given("User is invoked google site")
	public void user_is_invoked_google_site() {
		System.out.println("Invoking google");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: "+projectPath );
		System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/Drivers/chromedriver");
		driver =new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver",projectPath + "/src/test/resources/Drivers/geckodriver.exe");
		//driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	
	}

	@When("User enters search keyword")
	public void user_enters_search_keyword() throws InterruptedException {
		System.out.println("Search keyword entering");
		driver.navigate().to("https://google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		Thread.sleep(2000);
	}

	@And("clicks on search button")
	public void clicks_on_search_button() throws InterruptedException {
		System.out.println("search button clicking");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to listing page")
	public void user_is_navigated_to_listing_page() {
		System.out.println("Navigated to listing page");
		driver.getPageSource().contains("automation");
		driver.close();
		driver.quit();
		
	}

}
