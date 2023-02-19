package stepDefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.DriverBase;

@RunWith(Cucumber.class)
public class StepDefinition extends DriverBase
{
	
	@Given("^browser is invoked$")
    public void browser_is_invoked() throws IOException
	{
		driver=startBrowser();
    }
	
	@And("^link is provided$")
    public void link_is_provided()
    {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
    }

    @And("^pop-up is handled$")
    public void popup_is_handled()
    {
    	LandingPage lp=new LandingPage();
		try
		{
			lp.popUp(driver).click();
		}
		catch (Exception e)
		{
			
		}
    }

    @And("^login is clicked$")
    public void login_is_clicked()
    {
    	LandingPage lp=new LandingPage();
    	lp.getLogin(driver).click();
    }

    @When("^(.+) and (.+) are entered and clicked login$")
    public void and_are_entered_and_clicked_login(String username, String password)
    {
    	LoginPage log=new LoginPage(driver);
		log.userName().sendKeys(username);
		log.passWord().sendKeys(password);
		log.logIn().click(); 
    }

    @Then("^login is false and browser is closed$")
    public void login_is_false_and_browser_is_closed()
    {
    	driver.close();
    }
}

