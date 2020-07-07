package Scripts;

import org.testng.annotations.Test;
import org.testng.IRetryAnalyzer;

import junit.framework.Assert;

public class Retry_TestNG {
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		int i = 1/0;
	}
	
	@Test(retryAnalyzer = RetryAnalyzer_Setting.class)
	public void test3() {
		System.out.println("test3");
		Assert.assertTrue(0>1);


}
}
