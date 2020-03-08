package com.cengage.webassign.framework.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.cengage.webassign.BaseUtils.WebDriverFactory;
import com.cengage.webassign.Utils.*;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite //Initialize
    public void beforeSuite() throws WebAssignException {
        // WebDriverFactory driver = null;
        String options = "";
        // WebDriver driver = compose(options, 1000);
        // driver = WebDriverFactory.compose(options, 1000);
        // if (PropfileReader == null) {
        //     System.out.println("PropFileReader null");
        // }
        // if ()
        String browser = PropfileReader.getSetting("Browser");
        if (browser == null) {
            System.out.println("browser is null");
        }

        // driver.manage().window().maximize();

        System.setProperty("headless", "true"); // You can set this property elsewhere
        String headless = System.getProperty("headless");
        System.out.println("headless:");
        System.out.println(headless);

        // ChromeDriverManager.chromedriver();
        // if("true".equals(headless)) {
        //     System.out.println("with chrome optinos");
        //     ChromeOptions chromeOptions = new ChromeOptions();
        //     chromeOptions.addArguments("--headless");
        //     driver = new ChromeDriver(chromeOptions);
        // } else {
        //     ChromeOptions chromeOptions = new ChromeOptions();
        //     System.out.println("no headless options");
        //     driver = new ChromeDriver();
        // }
    }

    @AfterSuite
    public void afterSuite() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}