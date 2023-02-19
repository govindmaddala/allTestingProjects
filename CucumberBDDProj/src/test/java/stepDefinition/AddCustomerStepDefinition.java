package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects._0_BaseClass;
import pageObjects._1_LoginPage_PO;
import pageObjects._2_AddNewCustomer_PO;

public class AddCustomerStepDefinition extends _0_BaseClass {
	
	Logger log = LogManager.getLogger("StepDefinition");
	
	
	public  WebDriver driver;
    public _1_LoginPage_PO loginPage;
    public _2_AddNewCustomer_PO addCustomerPage;

	@Given("Browser launched")
    public void chrome_browser_launched() throws IOException {
		String browserName = browserName();
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}
        
        loginPage = new _1_LoginPage_PO(driver);
        log.info("Browser is launched");
    }
	
	@When("URL entered {string}")
    public void url_is_entered_something(String url) {
        driver.get(url);
        log.info("Url is entered");
    }
	
    @When("Enter credentials {string} and {string}")
    public void enter_credentials_and(String email, String password) {
        loginPage.enterCredentials(email, password);
        log.info("User credentials are entered");
    }

    @When("Click on Login button")
    public void click_on_login_button() {
        addCustomerPage = loginPage.clickLogin();
        log.info("Login is clicked");
    }
    
    @Then("Dashboard page title should be {string}")
    public void dashboard_age_title_should_be_something(String homePageTitle) {
        String pageTitle = driver.getTitle();
        pageTitle.equalsIgnoreCase(homePageTitle);
        Assert.assertEquals(pageTitle,homePageTitle);
        log.info("Page title is checked successfully");
    }

    @When("User clicks on Customers dropdown")
    public void user_clicks_on_customers_dropdown() {
        addCustomerPage.clickCustomerDropDown();
        log.info("Customer creation operation is started");
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
        log.info("Checked whether a user in correct page by verifying page title");
    }

    @When("user enter customer info")
    public void user_enter_customer_info() {
        addCustomerPage.enterUserInfo();
        log.info("Info is given");
    }

    @When("User clicks save button")
    public void user_clicks_save_button() {
        addCustomerPage.clickSaveBtn();
        log.info("Save button is clicked");

    }

    @Then("user can view confirmation message {string}")
    public void user_can_view_confirmation_message(String successMsg) {
        addCustomerPage.checkSuccessMsg(successMsg);
        log.info("Verification message of successful customer creation is done");
    }
    
    @And("Closes browser")
    public void close_browser() {
        driver.close();
        driver.quit();
        log.info("Browser is closed");
    }

    @After
    public void takeScreenshotOnFailure(Scenario sc) throws IOException {
    	boolean failed = sc.isFailed();
    	    	
    	if (failed) {
    		String failedLineName = sc.getLine().toString();
    		log.fatal("Error is at "+failedLineName+"th line");
    		String filePath = ".//target//Screenshots//"+failedLineName+".png";
    		File destPath = new File(filePath);
    		TakesScreenshot ss = ((TakesScreenshot)driver);
    		File ssAsFile = ss.getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(ssAsFile, destPath);
    		log.info("Screenshot is saved");
    		driver.close();
    		driver.quit();
    		
    	}
    	
    }

}
