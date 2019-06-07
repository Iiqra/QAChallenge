package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryMethodPage extends TestBase {

    /*
    Initializing the Page Objects
    */
    public DeliveryMethodPage() {
        PageFactory.initElements(driver, this);
    }

    /*
    Defining Page Factory : Object Repository
     */
    @FindBy(name = "userEmail")
    WebElement userEmailTextBox;

    /*
    Methods : Actions
     */
    public void TypeEmailAddressAndPressEnter(String email) {
        TestUtil.waitForVisiblityOfElement(driver, userEmailTextBox);
        userEmailTextBox.sendKeys(email);
        userEmailTextBox.sendKeys(Keys.ENTER);

    }

}
