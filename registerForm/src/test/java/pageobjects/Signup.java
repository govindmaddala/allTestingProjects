package pageobjects;

import org.openqa.selenium.By;

public class Signup 
{
	public By fname=By.id("usernamereg-firstName");
	public By lname=By.id("usernamereg-lastName");
	public By mail=By.id("usernamereg-yid");
	public By pwd=By.id("usernamereg-password");
	public By code=By.xpath("//select[@name='shortCountryCode']");
	public By phn=By.id("usernamereg-phone");
	public By month=By.id("usernamereg-month");
	public By day=By.id("usernamereg-day");
	public By year=By.id("usernamereg-year");
	public By gender=By.id("usernamereg-freeformGender");
	public By terms=By.cssSelector("[href*='terms']");
	public By submit=By.id("reg-submit-button");
}
