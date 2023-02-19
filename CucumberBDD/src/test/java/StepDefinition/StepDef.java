package StepDefinition;

import PageObject._2_AddNewCustomer_PO;
import PageObject._1_LoginPage_PO;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class StepDef {

    public  WebDriver driver;
    public _1_LoginPage_PO loginPage;

	@Given("^Chrome browser launched$")
    public void chrome_browser_launched() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new _1_LoginPage_PO(driver);
    }

    @When("^URL is entered \"([^\"]*)\"$")
    public void url_is_entered_something(String url) {
        driver.get(url);
    }

    @And("^Click on Login$")
    public void click_on_login(){
    loginPage.clickLogin();
    }

    @Then("^Page title should be \"([^\"]*)\"$")
    public void page_title_should_be_something(String homePageTitle) {
        String pageTitle = driver.getTitle();
        pageTitle.equalsIgnoreCase(homePageTitle);
        Assert.assertEquals(pageTitle,homePageTitle);
    }


    @When("^User clicked on logout$")
    public void user_clicked_on_logout()  {
        loginPage.clickLogout();
    }

    @And("^Close browser$")
    public void close_browser() {
        driver.close();
        driver.quit();
    }

    //////////////////////Add Customer////

    public _2_AddNewCustomer_PO addCustomerPage;

//    @Given("Chrome browser launched")
//    public void chrome_browser_launched() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }

//    @When("URL is entered {string}")
//    public void url_is_entered_something(String url) {
//        driver.get(url);
//    }

    @When("Enter credentials {string} and {string}")
    public void enter_credentials_and(String email, String password) {
        loginPage.enterCredentials(email, password);
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        addCustomerPage = loginPage.clickLogin();
    }

//    @Then("Page title should be {string}")
//    public void page_title_should_be_something(String dashboardTitle) {
//        String actualTitle = driver.getTitle();
//        Assert.assertEquals(actualTitle, dashboardTitle);
//    }

    @When("User clicks on Customers dropdown")
    public void user_clicks_on_customers_dropdown() {
        addCustomerPage.clickCustomerDropDown();
    }

    @When("User clicks on Customers option")
    public void user_clicks_on_customers_option() {
        addCustomerPage.clickCustomerOption();
    }

    @When("User clicks on Add new button")
    public void user_clicks_on_add_new_button() {
        addCustomerPage.clickAddNewCustomerBtn();
    }

    @Then("User can view Add new Customer page")
    public void user_can_view_add_new_customer_page() {
        String expectedPageTitle = "Add a new customer / nopCommerce administration";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(actualPageTitle, expectedPageTitle);
    }

    @When("user enter customer info")
    public void user_enter_customer_info() {
        addCustomerPage.enterUserInfo();
    }

    @When("User clicks save button")
    public void user_clicks_save_button() {
        addCustomerPage.clickSaveBtn();

    }

    @Then("user can view confirmation message {string}")
    public void user_can_view_confirmation_message(String successMsg) {
        addCustomerPage.checkSuccessMsg(successMsg);
    }

//    @And("Close browser")
//    public void close_browser() {
//        driver.close();
//    }
}
