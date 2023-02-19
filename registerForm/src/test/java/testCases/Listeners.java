package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BaseDriver;
import resources.ExtentReport;

public class Listeners extends BaseDriver implements ITestListener
{
	ExtentReports extent=ExtentReport.extentRepo();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		test=extent.createTest(methodName);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS,"Test is passed");
	}
	
	WebDriver driver=null;
	@Override
	public void onTestFailure(ITestResult result) 
	{
		test.fail(result.getThrowable());
		String testName= result.getMethod().getMethodName();
		String className=result.getInstanceName();
		
		try 
		{
			driver=(WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (Exception e)
		{
			
		}
		try 
		{
			test.addScreenCaptureFromPath(getScreenshot(className,testName,driver), result.getMethod().getMethodName());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		extent.flush();
	}
}
