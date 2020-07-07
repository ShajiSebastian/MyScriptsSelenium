package Scripts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_TestNG {
	
	@Test
	@Ignore
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

}
