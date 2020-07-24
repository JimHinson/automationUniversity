package com.cengage.webassign.framework.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.cengage.webassign.Utils.*;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite //Initialize
    public void beforeSuite() throws WebAssignException {
//        String browser = PropfileReader.getSetting("Browser");
//        if (browser == null) {
//            System.out.println("browser is null");
//        }
//        /** TODO: use or remove */
//        System.setProperty("headless", "true"); // You can set this property elsewhere
//        String headless = System.getProperty("headless");
//        System.out.println("headless:");
//        System.out.println(headless);

    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
//            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}