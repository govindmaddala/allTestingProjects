import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class _1_CreateDriverSession {
    public static void main(String[] args) throws MalformedURLException {
        String apkPath = System.getProperty("user.dir")+"\\src\\main\\resources\\ApiDemos-debug.apk";
        var caps = new DesiredCapabilities();

//        caps.setCapability("platformName","Android"); //or
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"pixel_6_pro");
        //or
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");

        caps.setCapability(MobileCapabilityType.APP,apkPath);

        //URL Object
        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,caps);
    }
}


