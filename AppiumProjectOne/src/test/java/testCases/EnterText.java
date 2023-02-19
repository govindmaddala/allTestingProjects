package testCases;

import com.base.InitiateDriver;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class EnterText {

    AppiumDriver driver;

    @BeforeClass
    public void startApp() throws MalformedURLException {
        driver = InitiateDriver.initDriver();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    By views = AppiumBy.accessibilityId("Views");

    AppiumBy listView = (AppiumBy) AppiumBy.id("android:id/list");

    @Test
    public void sendingKeys() {
        driver.findElement(views).click();
        WebElement viewList = driver.findElement(listView);
        driver.executeScript("mobile:swipeGesture", ImmutableMap.of("elementId",((RemoteWebElement) viewList).getId(),"direction","up","percent",0.75));
        //now scroll to

        ((AndroidDriver) driver).terminateApp("io.appium.android.apis", new AndroidTerminateApplicationOptions(

        ));

        ((AndroidDriver) driver).installApp("",new AndroidInstallApplicationOptions().withReplaceEnabled());
        ((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(10));
        ((AndroidDriver) driver).queryAppState("");
    }
}
