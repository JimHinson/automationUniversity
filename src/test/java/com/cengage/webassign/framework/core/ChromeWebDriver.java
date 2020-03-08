package com.cengage.webassign.framework.core;

import com.cengage.webassign.BaseUtils.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeWebDriver extends WebDriverFactory {
	public ChromeWebDriver() {}

  public WebDriver compose(String properties, int implicitWait) throws WebAssignException {

    WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    options.addArguments(properties);
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(options);
		driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    return driver;
	}	
}