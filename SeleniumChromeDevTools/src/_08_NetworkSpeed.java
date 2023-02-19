import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;

public class _08_NetworkSpeed {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CG-DTE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		DevTools devTools=driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.emulateNetworkConditions(true, 3000, 30000, 30000, Optional.empty()));
		
		devTools.addListener(Network.loadingFailed(), fail->
		{
			System.out.println(fail.getErrorText());
			System.out.println(fail.getTimestamp());
			
			/*
			 
			 net::ERR_INTERNET_DISCONNECTED
			 3322.998526
			 net::ERR_INTERNET_DISCONNECTED
		     3324.197811
			 net::ERR_INTERNET_DISCONNECTED
			 3324.484999
			 
			 */
			
		});
		long it=System.currentTimeMillis();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Library")).click();
		long et=System.currentTimeMillis();
		System.out.println(et-it);
		driver.close();
		
		//1909(without delay)  12793(with delay)
	}

}
