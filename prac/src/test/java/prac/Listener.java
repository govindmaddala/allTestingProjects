package prac;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.prac.base.Base;
import com.prac.base.ExtentReport;

public class Listener extends Base implements ITestListener {
	
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	
	/*
	  If test cases are running in parallel mode, replace the normal procedure with ThreadLocal mode and replace 
	  word "test" with "extentTest.get()" 
	
	 * */
	
	ExtentReports er = ExtentReport.Reports();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String method = result.getMethod().getMethodName();
		test = er.createTest(method);       // for parallel or series it is common

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test is passed");    // for series
		extentTest.get().log(Status.PASS, "Test is passed"); //for parallel  same with other 
	
	}
	
	WebDriver driver=null;

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		String className = result.getInstanceName();
		String methodName = result.getMethod().getMethodName();
		try {
			driver= (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(getScreenshot(driver,className,methodName), methodName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onFinish(ITestContext context) {
		er.flush();
	}
	
}

