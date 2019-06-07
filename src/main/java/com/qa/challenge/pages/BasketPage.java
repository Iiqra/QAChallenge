package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage extends TestBase {

    //Initializing the Page Elements with Constructor
    public BasketPage() {
        PageFactory.initElements(driver, this);
    }

    /*
    Defining Page Factory : Object Repository
     */
    @FindBy(xpath = "//button[@class='wb-e-btn-1 dcp-pdp-buy-box-add-to-basket__cta ng-binding ng-scope dcp-pdp-buy-box-add-to-basket__cta--one-variant']")
    WebElement addToBasketButton;

    @FindBy(xpath = "//button[@class='wb-e-btn-1 dcp-modal__cta dcp-modal__cta--primary ng-binding']")
    WebElement goToShoppingBasketButton;

    /*
    Methods : Actions
     */
    public void clickAddToBasket() {
        TestUtil.waitForVisiblityOfElement(driver, addToBasketButton);
        addToBasketButton.click();
    }

    public void clickGoToShoppingBasket() {
        TestUtil.waitForVisiblityOfElement(driver, goToShoppingBasketButton);
        goToShoppingBasketButton.click();
    }

}
