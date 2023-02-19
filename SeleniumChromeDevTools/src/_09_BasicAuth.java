import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.URI;
import java.util.function.Predicate;

public class _09_BasicAuth {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CG-DTE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//predicate: to filter the input data and returns output  
		Predicate<URI> uriPred=uri -> uri.getHost().contains("httpbin.org");
		
		((HasAuthentication)driver).register(uriPred,UsernameAndPassword.of("foo", "bar"));
		
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		String data=driver.findElement(By.cssSelector("pre")).getText();
		System.out.println(data);
		
		/*
		 
		 {
  			"authenticated": true, 
  			"user": "foo"
		 }
		 
		 */
	}
}
