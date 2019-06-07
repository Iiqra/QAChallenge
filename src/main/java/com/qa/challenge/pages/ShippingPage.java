package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends TestBase {


    //Initializing the Page Objects
    public ShippingPage() {
        PageFactory.initElements(driver, this);
    }

    /*
    Defining Page Factory : Object Repository
     */
    @FindBy(xpath = "//label[contains(text(),'Mr')]")
    public WebElement mrSalutationRadioButton;

    @FindBy(xpath = "//label[contains(text(),'Ms')]")
    public WebElement msSalutationRadioButton;

    @FindBy(xpath = "//input[@id='co_payment_address-firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-line2']")
    public WebElement numberTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-line1']")
    public WebElement streetTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-town']")
    public WebElement townTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-postalCode']")
    public WebElement postalCodeTextBox;

    @FindBy(xpath = "//input[@id='dateOfBirth']")
    public WebElement dateOfBirthTextBox;

    @FindBy(xpath = "//input[@placeholder='MM']")
    public WebElement monthOfBirthTextBox;

    @FindBy(xpath = "//input[@placeholder='YYYY']")
    public WebElement yearOfBirthTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-phone']")
    public WebElement telephoneNumberTextBox;

    @FindBy(xpath = "//button[@class='wb-e-btn-1 dcp-co-func-footer__cta-primary ng-binding ng-scope']")
    WebElement continueToPaymentTypeButton;

    /*
    Methods : Actions
     */
    public void selectSalutation(WebElement element) {
        TestUtil.waitForVisiblityOfElement(driver,element);
        element.click();
    }

    public void clickContinueToPaymentTypeButton(){
        TestUtil.waitForVisiblityOfElement(driver,continueToPaymentTypeButton);
        continueToPaymentTypeButton.click();
    }

}
