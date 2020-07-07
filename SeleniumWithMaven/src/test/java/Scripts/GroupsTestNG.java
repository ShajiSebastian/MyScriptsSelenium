package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Test(groups = "AllTests")
public class GroupsTestNG {
	
	@Test(groups = {"Sanity"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = {"Sanity","Smoke"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups = {"Regression"})
	public void test3() {
		System.out.println("test3");
	}
	
	@Test(groups = {"Regression"})
	public void test4() {
		System.out.println("test4");
	}

}
