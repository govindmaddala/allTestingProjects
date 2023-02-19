import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _5_DefiningElements {
    AppiumDriver driver;

    public _5_DefiningElements(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    //Normal way of finding element

    public void normalWay(){
        WebElement element1 = driver.findElement(AppiumBy.accessibilityId("jgjgg"));
        element1.click();
    }

    //Using By ===> it is for webelements only
    By element2  = By.className("classname");
    public void byMethod(){
        driver.findElement(element2).click();
    }

    AppiumBy element3 = (AppiumBy) AppiumBy.accessibilityId("accID");
    public void AppiumByMethod(){
        driver.findElement(element3).click();
    }

    @FindBy(xpath = "vhh") private static WebElement element4;
    public void findByMethod(){
        element4.click();
    }

    @AndroidFindBy (accessibility = "ffff") private static WebElement element5;
    public void androidFindByMethod(){
        element5.click();
    }

    @AndroidBy(accessibility = "vhh") private static WebElement element6;
    public void androidByMethod(){
        element6.click();
    }
}
