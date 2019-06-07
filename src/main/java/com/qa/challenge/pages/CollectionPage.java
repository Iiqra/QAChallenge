package com.qa.challenge.pages;

import com.qa.challenge.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collection extends TestBase {


    //Initializing the Page Objects

    public Collection(){
        PageFactory.initElements(driver,this);
    }

    //Defining Page Factory : Object Repository

    @FindBy(className="col-xs-6 col-sm-3 ng-scope slick-slide slick-current slick-active")
    WebElement firstRecommendationProduct;

    //Methods : Actions

    public void selectRecommendation(WebElement element){
        element.click();
    }
}
