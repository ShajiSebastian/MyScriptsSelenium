package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaCountPage_POM {

	public static WebElement element = null;
	public static String  TotalCoronaElement = "//*[@id='maincounter-wrap']//child::div//child::span";
	public static String  TotalDeathElement = "//*[@id='maincounter-wrap']//child::div//child::span";
	
	
	public  static WebElement TotalCoronaCountElement(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='maincounter-wrap']//child::div//child::span"));
		return element;
	}
	
	public static WebElement TotalDeathCountElement(WebDriver driver) {
		element= driver.findElement(By.xpath("//*[@id='maincounter-wrap'][2]//child::div//child::span"));
		return element;
	}

}
	

	
