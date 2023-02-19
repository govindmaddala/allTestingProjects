import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v97.fetch.Fetch;

public class _05_MockingAPIrequests {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CG-DTE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request ->
		{
			if(request.getRequest().getUrl().contains("shetty"))
			{
				String mockurl=request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				System.out.println(mockurl);
				
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockurl), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
			}
			else
			{
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
			}
		}
				
				);

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Library")).click();
		String txt=driver.findElement(By.cssSelector("p")).getText();
		System.out.println(txt);
		//Fetch Domain
			//a domain for letting clients(selenium) substitute browser's network layer with client code
		
		
/*

https://rahulshettyacademy.com/angularAppdemo/
https://rahulshettyacademy.com/angularAppdemo/styles.a08360268505841b3234.css
https://rahulshettyacademy.com/angularAppdemo/runtime.7b63b9fd40098a2e8207.js
https://rahulshettyacademy.com/angularAppdemo/scripts.c4c155fcd63d2bd4d4c6.js
https://rahulshettyacademy.com/angularAppdemo/main.954e66096a8c863a96f6.js
https://rahulshettyacademy.com/angularAppdemo/polyfills.94daefd414b8355106ab.js
https://rahulshettyacademy.com/angularAppdemo/favicon.ico
https://rahulshettyacademy.com/Library/GetBook.php?AuthorName=BadGuy
https://rahulshettyacademy.com/angularAppdemo/favicon.ico
Oops only 1 Book available

*/
	}

}
