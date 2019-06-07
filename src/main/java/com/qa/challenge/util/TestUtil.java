package com.qa.challenge.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtil {

    static WebDriverWait explicitWait ;

    public static long PAGE_LOAD_TIMEOUT = 15;
    public static long IMPLICIT_WAIT = 10;

    public static void waitForVisiblityOfElement(WebDriver driver, WebElement element){
        explicitWait = new WebDriverWait(driver, PAGE_LOAD_TIMEOUT);
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
