package com.qa.challenge.base;

import com.qa.challenge.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    //Declared static Webdriver and Properties variables
    public static WebDriver driver;
    public static Properties properties;

    //Constructor will load the properties file
    public TestBase() {
        try {
            properties = new Properties();

            //You need to add your config.properties path here
            FileInputStream fileInputStream = new FileInputStream("F:/Documents/" +
                    "Benz/Project/QAChallenge/src/main/resources/config.properties");
            properties.load(fileInputStream);
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    /*
    This method will load the browser name from properties file,
    opens that browser, maximizes it, deletes the cookies,
    sets the timeouts of the page and will redirects to the
    desired url mentioned in the config.properties file
     */
    public static void initialization() {

        //reads the browser name from config.properties
        String browserName = properties.getProperty("browserName");

        //checks which browser in needed to instantiate
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        //initial setup of the browser
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

        //open the desired url from config.properties file
        driver.get(properties.getProperty("url"));
    }

}