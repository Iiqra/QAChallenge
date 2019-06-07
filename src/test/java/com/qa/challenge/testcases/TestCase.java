package com.qa.challenge.testcases;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.pages.*;
import com.qa.challenge.util.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase extends TestBase {

    BasketPage basketPage;
    CookiesAlert cookiesAlert;
    CollectionPage collectionPage;
    CartPage cartPage;
    DeliveryMethodPage deliveryMethodPage;
    ShippingPage shippingPage;

    TestCase(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        basketPage = new BasketPage();
        cookiesAlert = new CookiesAlert();
        collectionPage = new CollectionPage();
        cartPage = new CartPage();
        deliveryMethodPage = new DeliveryMethodPage();
        shippingPage = new ShippingPage();
    }

    @Test(priority = 1)
    public void placeOrderViaGuest() throws InterruptedException {
        cookiesAlert.clickClose();
        collectionPage.selectRecommendation(collectionPage.firstRecommendationProduct);
        basketPage.clickAddToBasket();
        basketPage.clickGoToShoppingBasket();
        cartPage.clickContinueToAddressAndDelivery();
        deliveryMethodPage.TypeEmailAddressAndPressEnter(properties.getProperty("email"));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
