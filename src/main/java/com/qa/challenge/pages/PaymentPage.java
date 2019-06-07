package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends TestBase {

    /*
    Initializing the Page Objects
     */
    public PaymentPage() {
        PageFactory.initElements(driver, this);
    }

    /*
    Defining Page Factory : Object Repository
     */
    @FindBy(xpath = "//strong[contains(text(),'Credit Card')]")
    public WebElement creditCardRadioButton;

    @FindBy(xpath = "//label[contains(text(),'VISA')]")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//label[contains(text(),'MasterCard')]")
    public WebElement masterCardRadioButton;

    @FindBy(xpath = "//label[contains(text(),'American Express')]")
    public WebElement americanExpressRadioButton;

    @FindBy(xpath = "//strong[contains(text(),'PayPal')]")
    public WebElement paypalRadioButton;

    @FindBy(xpath = "//button[@class='wb-e-btn-1 dcp-co-func-footer__cta-primary ng-binding ng-scope']")
    WebElement continueToVerificationAndOrderPlacementButton;

    /*
    Methods : Actions
     */
    public void selectPaymentType(WebElement element) {
        TestUtil.waitForVisiblityOfElement(driver, element);
        element.click();
    }

    public void clickContinueToVerificationAndOrderPacement() {
        TestUtil.waitForVisiblityOfElement(driver, continueToVerificationAndOrderPlacementButton);
        continueToVerificationAndOrderPlacementButton.click();
    }

}
