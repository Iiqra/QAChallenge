package com.qa.challenge.testcases;

import com.qa.challenge.base.TestBase;
import com.qa.challenge.pages.*;
import com.qa.challenge.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderTestCase extends TestBase {

    BasketPage basketPage;
    CookiesAlert cookiesAlert;
    CollectionPage collectionPage;
    CartPage cartPage;
    DeliveryMethodPage deliveryMethodPage;
    ShippingPage shippingPage;
    PaymentPage paymentPage;
    SummaryPage summaryPage;

    //constructor
    PlaceOrderTestCase() {
        super();
    }

    /*
    This method will initialize the basic setup to run a test case.
    Also, It will create objects.
     */
    @BeforeMethod
    public void setUp() {
        initialization();
        basketPage = new BasketPage();
        cookiesAlert = new CookiesAlert();
        collectionPage = new CollectionPage();
        cartPage = new CartPage();
        deliveryMethodPage = new DeliveryMethodPage();
        shippingPage = new ShippingPage();
        paymentPage = new PaymentPage();
        summaryPage = new SummaryPage();
    }

    //test case - place order via Guest but do not order
    @Test()
    public void placeOrderViaGuestButDoNotOrderTestCase() throws InterruptedException {
        cookiesAlert.clickClose();
        collectionPage.selectRecommendation(collectionPage.firstRecommendationProduct);
        basketPage.clickAddToBasket();
        basketPage.clickGoToShoppingBasket();
        cartPage.clickContinueToAddressAndDelivery();
        deliveryMethodPage.TypeEmailAddressAndPressEnter(properties.getProperty("email"));
        fillInvoiceAddress();
        shippingPage.clickContinueToPaymentTypeButton();
        paymentPage.selectPaymentType(paymentPage.paypalRadioButton);
        paymentPage.clickContinueToVerificationAndOrderPacement();
        Assert.assertTrue("Your order data".equalsIgnoreCase(summaryPage.getOrderDataHeadingText()));
    }

    //Fill Invoice address Form
    public void fillInvoiceAddress(){
        shippingPage.selectSalutation(shippingPage.mrSalutationRadioButton);
        TestUtil.sendKeysToTextBox(driver,shippingPage.firstNameTextBox,properties.getProperty("firstName"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.lastNameTextBox,properties.getProperty("lastName"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.numberTextBox,properties.getProperty("number"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.streetTextBox,properties.getProperty("street"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.townTextBox,properties.getProperty("town"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.postalCodeTextBox,properties.getProperty("postalCode"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.dateOfBirthTextBox,properties.getProperty("dateOfBirth"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.monthOfBirthTextBox,properties.getProperty("monthOfBirth"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.yearOfBirthTextBox,properties.getProperty("yearOfBirth"));
        TestUtil.sendKeysToTextBox(driver,shippingPage.telephoneNumberTextBox,properties.getProperty("telephoneNumber"));
    }

    //closes the WebDriver
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
