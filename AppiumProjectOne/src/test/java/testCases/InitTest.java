package testCases;

import com.base.InitiateDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class InitTest {
    AppiumDriver driver;
        @BeforeClass
        public void startApp() throws MalformedURLException {
            driver = InitiateDriver.initDriver();
        }

        @Test(priority = 1)
        public void handleFunctions(){

//            By accesibilityOption = AppiumBy.accessibilityId("Access'ibility");
//            System.out.println(driver.findElement(accesibilityOption).getText());

            driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
            driver.findElement(AppiumBy.id("android:id/text1")).click();
            String actualHeading = driver.findElement(AppiumBy.className("android.widget.TextView")).getText();
            //Enable TalkBack and Explore-by-touch from accessibility settings. Then touch the colored squares.
            String expectedHeading = "Accessibility/Accessibility Node Provider";
            Assert.assertEquals(actualHeading,expectedHeading);
            driver.navigate().back();
        }

    @Test(priority = 2)
    public void handleFunction(){
        driver.navigate().back();
        driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
        driver.findElement(AppiumBy.id("android:id/text1")).click();
        String actualHeading = driver.findElement(AppiumBy.className("android.widget.TextView")).getText();
        String expectedHeading = "Accessibility/Accessibility Node Provider";
        Assert.assertEquals(actualHeading,expectedHeading);
        driver.navigate().back();
    }

    @Test(priority = 3)
    public void handleFunctionz(){
        driver.navigate().back();
        WebElement uiEle = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Access'ibility\")"));
        String expectedText = "Access'ibility";
        Assert.assertEquals(uiEle.getText(),expectedText);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        }
}
