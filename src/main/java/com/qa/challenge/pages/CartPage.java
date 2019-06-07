package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends TestBase {
    //Initializing the Page Objects

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    //Defining Page Factory : Object Repository

    @FindBy(xpath = "//button[@class='wb-e-btn-1 dcp-co-func-header__cta-primary ng-binding']")
    WebElement continueToAddressAndDeliveryButton;

    //Methods : Actions

    public void clickContinueToAddressAndDelivery() {
        TestUtil.waitForVisiblityOfElement(driver, continueToAddressAndDeliveryButton);
        continueToAddressAndDeliveryButton.click();
    }
}
