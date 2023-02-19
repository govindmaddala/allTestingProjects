package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class _2_AddNewCustomer_PO extends _0_BaseClass {
	
	public WebDriver ldriver;

    public _2_AddNewCustomer_PO(WebDriver rDriver) {
        ldriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(xpath = "//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
    WebElement CustomersDropdownBtn;

    @FindBy(xpath = "//p[text()=' Customers']")
    WebElement customerOption;

    //Add New btn

    @FindBy(css = "a[href*='/Admin/Customer/Create']")
    WebElement addCustomer;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id = "Gender_Male")
    WebElement male;

    @FindBy(id = "Gender_Female")
    WebElement female;

    @FindBy(id = "DateOfBirth")
    WebElement dob;

    @FindBy(id = "Company")
    WebElement company;

    @FindBy(id = "IsTaxExempt")
    WebElement taxExtemptCheckBox;

    @FindBy(css = "select[name*='NewsletterSubscription']")
    WebElement newsLetter;

    @FindBy(css = ".k-widget.k-multiselect.k-multiselect-clearable")
    WebElement newsLetterAndCustomerRoles;

    // value = 1  ==>  Your store name
    // value = 2  ==>  Test store 2

    @FindBy(css = "select[name*='CustomerRole']")
    WebElement customerRoles;
    // value = 1  ==>  Administrators
    // value = 2  ==>  Forum Moderators
    // value = 3  ==>  Registered
    // value = 4  ==>  Guests
    // value = 5  ==>  Vendors


    @FindBy(css = "select#VendorId")
    WebElement vendorSelector;
    // value = 0  ==>  Not a vendor
    // value = 1  ==>  Vendor 1
    // value = 2  ==>  Vendor 2

    @FindBy(css = "[for='Active']")
    WebElement activeCheckBox;

    @FindBy(css = "#AdminComment")
    WebElement adminComment;

    @FindBy(css = "[name='save']")
    WebElement save;

    @FindBy(css = "[name='save-continue']")
    WebElement saveContinue;

    @FindBy(css = ".alert-success")
    WebElement successMsgDiv;


    public void clickCustomerDropDown() {
        CustomersDropdownBtn.click();
    }

    public void clickCustomerOption() {
        customerOption.click();
    }

    public void clickAddNewCustomerBtn() {
        addCustomer.click();
    }

    public void enterUserInfo() {
    	
    	String emailHeader = generateRandomEmail();
        email.sendKeys(emailHeader+"@gmail.com");
        password.sendKeys("Qwerty@21");
        firstName.sendKeys("fname");
        lastName.sendKeys("lname");
        male.click();
        dob.sendKeys("10/6/1995");
        company.sendKeys("MyCompany");
        taxExtemptCheckBox.click();

//      newsLetterAndCustomerRoles.click();
//      Select newPaper = new Select(newsLetter);
//      newPaper.selectByVisibleText("Your store name");

//
//      customerRoles.click();
//      Select customer = new Select(customerRoles);
//      customer.deselectByIndex(0);
////      customer.selectByValue("1");
//
//      vendorSelector.click();
        Select vendor = new Select(vendorSelector);
        vendor.selectByValue("1");
        adminComment.sendKeys("This is comment");
    }

    public void clickSaveBtn() {
        save.click();
    }

    public void checkSuccessMsg(String successMsg) {
        String actualSuccessMsg = successMsgDiv.getText();
        boolean flag = actualSuccessMsg.contains(successMsg);
        Assert.assertTrue(flag);
    }

}
