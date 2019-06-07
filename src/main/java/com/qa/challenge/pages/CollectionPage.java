package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionPage extends TestBase {

    //Initializing the Page Elements with Constructor
    public CollectionPage() {
        PageFactory.initElements(driver, this);
    }

    /*
    Defining Page Factory : Object Repository
     */
    @FindBy(xpath = "//div[@class='utils-product-cms-carousel-image-inner']")
    public WebElement firstRecommendationProduct;

    /*
    Methods : Actions
     */
    public void selectRecommendation(WebElement element) {
        TestUtil.waitForVisiblityOfElement(driver, element);
        element.click();
    }
}
