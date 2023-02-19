import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class _3_AppPackageAppActivity {

    public static void main(String[] args) throws MalformedURLException {
        String apkPath = System.getProperty("user.dir")+"\\src\\main\\resources\\ApiDemos-debug.apk";
        var caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");


        caps.setCapability("appPackage","io.appium.android.apis");
//        caps.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        caps.setCapability("appActivity","io.appium.android.apis.accessibility.CustomViewAccessibilityActivity");

//        caps.setCapability("appPackage","com.android.chrome");
//        caps.setCapability("appActivity","org.chromium.chrome.browser.firstrun.FirstRunActivity");

        //URL Object
        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,caps);
    }
}
