import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class _2_CreateDriverSessionByOptions {

    public static void main(String[] args) throws MalformedURLException {

        String apkPath = System.getProperty("user.dir")+"\\src\\main\\resources\\ApiDemos-debug.apk";
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("pixel_6_pro")
                .setApp(apkPath);
        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,options);

    }
}
