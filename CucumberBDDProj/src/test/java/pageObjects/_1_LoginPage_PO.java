package pageObjects;

import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1_LoginPage_PO {
	
	WebDriver ldriver;
	public _1_LoginPage_PO(WebDriver rDriver) {
		ldriver = rDriver;
		ldriver.manage().window().maximize();
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(css = "button[class*= 'login-button']")
	WebElement loginBtn;

	@FindBy(css = "a[href*='logout']")
	WebElement logout;
	
	public void enterCredentials(String emailDet,String passwordDet){
		
		email.clear();
		email.sendKeys(emailDet);
		password.clear();
		password.sendKeys(passwordDet);
	}

	public _2_AddNewCustomer_PO clickLogin(){
		loginBtn.click();
		return new _2_AddNewCustomer_PO(ldriver);
	}

	public void clickLogout(){
		logout.click();
	}

}
