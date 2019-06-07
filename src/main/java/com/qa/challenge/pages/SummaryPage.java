package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage extends TestBase {


    //Initializing the Page Objects
    public SummaryPage() {
        PageFactory.initElements(driver, this);
    }

    //Defining Page Factory : Object Repository

    @FindBy(xpath = "//h2[@class='dcp-co-order-data-summary__headline ng-binding']")
    WebElement yourOrderDataHeading;

    //Methods : Actions

    public String getOrderDataHeadingText() {
        TestUtil.waitForVisiblityOfElement(driver, yourOrderDataHeading);
        return yourOrderDataHeading.getText();
    }

}
