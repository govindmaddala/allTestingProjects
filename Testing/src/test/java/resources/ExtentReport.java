package resources;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport 
{
	static ExtentReports er=new ExtentReports(); //static is done to call meth without obj
	@BeforeTest
	public static ExtentReports extentRepo()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esr=new ExtentSparkReporter(path);
		esr.config().setReportName("Testing Project Results");
		esr.config().setDocumentTitle("Results of Testing registration");
		er.attachReporter(esr);
		er.setSystemInfo("Tester", "Govind Maddala");
		return er;
	}
}
