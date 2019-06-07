package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesAlert extends TestBase {

    //Initializing the Page Objects

    public CookiesAlert() {
        PageFactory.initElements(driver, this);
    }

    //Defining Page Factory : Object Repository

    @FindBy(id = "button-text")
    WebElement closeButton;

    //Methods : Actions

    public void clickClose() {
        TestUtil.waitForVisiblityOfElement(driver, closeButton);
        closeButton.click();
    }

}
