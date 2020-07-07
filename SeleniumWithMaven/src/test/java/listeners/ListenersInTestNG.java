package listeners;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersInTestNG implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("*****Test name:"+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test is Successfull:"+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****Test is Failed:"+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test Skipped:"+ result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("*****Test started (context):"+ context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("*****Test Finished:"+ context.getName());
		
	}

	
}
