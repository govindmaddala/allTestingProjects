import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection.System;

public class _7_Listeners implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		//Invoked each time before a test will be invoked
		System.out.println("test is started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
	    //Invoked each time a test succeeds.
		System.out.println("test is passed successfully");
	  }
	
	  @Override
	  public void onTestFailure(ITestResult result) 
	  {
	    //Invoked each time a test fails.
		  System.out.println("test is failed & it's name is:"+result.getName());
		  
	  }
	  
	  @Override
	  public void onTestSkipped(ITestResult result) 
	  {
	    //Invoked each time a test is skipped.
	  }
	  
	  @Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	  {
	    //Invoked each time a method fails but has been annotated with successPercentage and this failure
		   //still keeps it within the success percentage requested.
	  }
	  
	  @Override
	  public void onTestFailedWithTimeout(ITestResult result) 
	  {
	    onTestFailure(result);
	    //Invoked each time a test fails due to a timeout.
	  }
	  
	  @Override
	  public void onStart(ITestContext context) 
	  {
	    //Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
		   //and calling all their Configuration methods.
	  }
	  
	  @Override
	  public void onFinish(ITestContext context) 
	  {
	    //Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
		 //and all their Configuration methods have been called.
		System.out.println("Test is finished");
	  }
}
