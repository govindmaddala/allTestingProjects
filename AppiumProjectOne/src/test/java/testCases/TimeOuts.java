package testCases;

import com.base.InitiateDriver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class TimeOuts {

    AppiumDriver driver;

    @BeforeClass
    public void startApp() throws MalformedURLException {
        driver = InitiateDriver.initDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    By views = AppiumBy.accessibilityId("Views");

    @Test
    public void explicitWait(){

        WebElement element1 = driver.findElement(views);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfAllElements(element1));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
