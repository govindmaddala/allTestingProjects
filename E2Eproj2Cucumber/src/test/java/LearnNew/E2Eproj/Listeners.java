package LearnNew.E2Eproj;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.DriverBase;
import resources.ExtentReport;

public class Listeners extends DriverBase implements ITestListener
{
	ExtentReports extent=ExtentReport.extentRepo();
	ExtentTest test;
	ThreadLocal<ExtentTest> tl=new ThreadLocal<ExtentTest>(); //parallel-run
	
	@Override
	public void onTestStart(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		test = extent.createTest(methodName);
		tl.set(test);  //parallel-run
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		//test.log(Status.PASS,"Test is passed");
		tl.get().log(Status.PASS,"Test is passed");			//parallel-run
	}

	WebDriver driver=null;
	@Override
	public void onTestFailure(ITestResult result) 
	{
		//test.fail(result.getThrowable());
		tl.get().fail(result.getThrowable());				//parallel-run
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
			tl.get().addScreenCaptureFromPath(getScreenshot(className,testName,driver), result.getMethod().getMethodName());
			//getScreenshot(className,testName,driver); --> to create screenshot but this method is modified for above line to get path of 
			//screenshot's path which can be attached to extentreports.
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
