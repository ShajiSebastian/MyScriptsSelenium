package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoronaCountPage1_PageFactory {
	
	WebDriver driver = null;
	String totalCoronaCount;
	String totalDeathCount;
	
	public CoronaCountPage1_PageFactory(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, CoronaCountPage1_PageFactory.class);
		
	}
	
	@FindBy(id = "maincounter-wrap")
	WebElement TotalCoronaCount;
	
	@FindBy(id = "maincounter-wrap")
	WebElement TotalDeathCount;
	
	public void TotalCoronaCount() {
		TotalCoronaCount.getText();
	}
	
	public void TotalDeathCount() {
		TotalDeathCount.getText();
	}
	
	public void DisplayCount() {
		System.out.println("We are inside PageFactory file" );
		System.out.println("Corona count is: "+totalCoronaCount );
		System.out.println("Corona death count is: "+totalDeathCount );
	}
	
}