package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
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
    WebElement mrSalutationRadioButton;

    @FindBy(xpath = "//label[contains(text(),'Ms')]")
    WebElement msSalutationRadioButton;

    @FindBy(xpath = "//input[@id='co_payment_address-firstName']")
    WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-lastName']")
    WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-line2']")
    WebElement numberTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-line1']")
    WebElement streetTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-town']")
    WebElement townTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-postalCode']")
    WebElement postalCodeTextBox;

    @FindBy(xpath = "//input[@id='dateOfBirth']")
    WebElement dateOfBirthTextBox;

    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement monthOfBirthTextBox;

    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement yearOfBirthTextBox;

    @FindBy(xpath = "//input[@id='co_payment_address-phone']")
    WebElement telephoneNumberTextBox;


    /*
    Methods : Actions
     */

}
