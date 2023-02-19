import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs 
{
	//Access Key
	  public static final String USERNAME = "oauth-govindmvn-bcdbf";
	  public static final String ACCESS_KEY = "9bb4b4d1-3258-4f33-99fd-c07f7334b1de";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException 
	{
		//for desired capabilities link is 
		//https://saucelabs.com/platform/platform-configurator?src=sidebar
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 7");
		browserOptions.setBrowserVersion("75");
		Map<String, Object> sauceOptions = new HashMap<>();
		browserOptions.setCapability("sauce:options", sauceOptions);

		RemoteWebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(URL);

	}

}
