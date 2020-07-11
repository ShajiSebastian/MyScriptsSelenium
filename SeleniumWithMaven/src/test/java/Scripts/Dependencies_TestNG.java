package Scripts;


import org.openqa.selenium.WebDriver;

//dependsOnMethods and dependsOnGroups

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dependencies_TestNG {

	@Test(dependsOnMethods = {"test2"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(dependsOnGroups = {"Sanity1"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = "Sanity1")
	public void test3() {
		System.out.println("test3");
	}
}
