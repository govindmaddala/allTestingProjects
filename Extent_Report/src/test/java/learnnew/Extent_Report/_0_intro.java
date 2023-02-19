package learnnew.Extent_Report;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class _0_intro 
{
	ExtentReports er=new ExtentReports();
	@BeforeTest()
	public void config()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esr=new ExtentSparkReporter(path);
		esr.config().setReportName("Web Automatiom Results");
		esr.config().setDocumentTitle("Test results");
		
		er.attachReporter(esr);
		er.setSystemInfo("Tester", "Govind Maddala");
	}
	
	@Test
	public void extentrepoDemo()
	{
		ExtentTest test= er.createTest("extentrepoDemo");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver surf = new ChromeDriver();
		surf.get("https://prsindia.org/");
		System.out.println(surf.getTitle());
		//surf.findElement(By.className("mp_search_by_name_pin_code")).sendKeys("Delhi");  //actually "mp_search_by_name_pin_code" is an id but I gave it as class
		surf.close();
		test.fail("This is created for failure scenario deliberately");
		er.flush();
	}
}
